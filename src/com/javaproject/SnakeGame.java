package com.javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        super("Snake Game");

        Board board = new Board();

        // Stylish Buttons Panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        JButton start = createButton("START", new Color(0, 140, 255));
        JButton pause = createButton("PAUSE", new Color(255, 100, 0));
        JButton resume = createButton("RESUME", new Color(0, 180, 0));
        JButton exit = createButton("EXIT", new Color(200, 0, 0));

        panel.add(start);
        panel.add(pause);
        panel.add(resume);
        panel.add(exit);

        add(panel, BorderLayout.NORTH);
        add(board, BorderLayout.CENTER);

        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Button click events
        start.addActionListener(e -> board.startGame());
        pause.addActionListener(e -> board.pauseGame());
        resume.addActionListener(e -> board.resumeGame());
        exit.addActionListener(e -> System.exit(0));
    }

    // 🔥 STYLISH BUTTON METHOD
    private JButton createButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 15));
        btn.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        btn.setPreferredSize(new Dimension(100, 35));

        // Hover Effect
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { btn.setBackground(bg.darker()); }
            public void mouseExited(MouseEvent e) { btn.setBackground(bg); }
        });

        return btn;
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}


// -------------------- BOARD CLASS -------------------------------

class Board extends JPanel implements ActionListener {

    private Image apple, dot, head;

    private int score = 0;
    private final int alldot = 900, dotsize = 10;
    private final int RandomPosition = 50;

    private int apple_x;
    private int apple_y;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = false;

    private final int boardWidth = 550;
    private final int boardHight = 500;

    private final int x[] = new int[alldot];
    private final int y[] = new int[alldot];

    private int dots;
    Timer timer;

    public Board() {
        addKeyListener(new TAdapter());
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(boardWidth, boardHight));
        setFocusable(true);
        loadImages();
    }

    public void loadImages() {
        apple = new ImageIcon(ClassLoader.getSystemResource("BasicProject/icons/apple.png")).getImage();
        dot = new ImageIcon(ClassLoader.getSystemResource("BasicProject/icons/dot.png")).getImage();
        head = new ImageIcon(ClassLoader.getSystemResource("BasicProject/icons/head.png")).getImage();
    }

    // -------------------- START GAME ----------------------
    public void startGame() {
        score = 0;
        dots = 3;
        inGame = true;

        for (int i = 0; i < dots; i++) {
            y[i] = 50;
            x[i] = 50 - i * dotsize;
        }

        locateApple();

        if (timer != null) timer.stop();
        timer = new Timer(150, this);
        timer.start();

        requestFocusInWindow();  // Keyboard control active
    }
    // -------------------- PAUSE GAME ---------------------
    public void pauseGame() {
        if (timer != null) timer.stop();
    }

    // -------------------- RESUME GAME ---------------------
    public void resumeGame() {
        if (timer != null) timer.start();
        requestFocusInWindow();  // 🔥 सबसे जरूरी — अब keys resume के बाद भी काम
    }

    public void locateApple() {
        int r = (int) (Math.random() * RandomPosition);
        apple_x = r * dotsize;
        r = (int) (Math.random() * RandomPosition);
        apple_y = r * dotsize;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (inGame) {

            g.setColor(Color.WHITE);
            g.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
            g.drawString("Score : " + score, 10, 20);

            g.drawImage(apple, apple_x, apple_y, this);

            for (int i = 0; i < dots; i++) {
                if (i == 0) g.drawImage(head, x[i], y[i], this);
                else g.drawImage(dot, x[i], y[i], this);
            }

        } else {
            gameOver(g);
        }

        Toolkit.getDefaultToolkit().sync();
    }

    public void gameOver(Graphics g) {
        String msg = "Game Over";
        Font font = new Font("SAN_SERIF", Font.BOLD, 50);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(msg, (boardWidth - metrics.stringWidth(msg)) / 2, boardHight / 2);

        String scoreMsg = "Score : " + score;
        g.drawString(scoreMsg, (boardWidth - metrics.stringWidth(scoreMsg)) / 2, (boardHight / 2) + 50);
    }

    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        if (leftDirection) x[0] -= dotsize;
        if (rightDirection) x[0] += dotsize;
        if (upDirection) y[0] -= dotsize;
        if (downDirection) y[0] += dotsize;
    }

    public void checkApple() {
        if (x[0] == apple_x && y[0] == apple_y) {
            dots++;
            score++;
            locateApple();
        }
    }

    public void checkCollision() {

        // Use real board size instead of fixed size
        if (y[0] >= getHeight()) inGame = false;
        if (x[0] >= getWidth()) inGame = false;

        if (y[0] < 0) inGame = false;
        if (x[0] < 0) inGame = false;

        if (!inGame) timer.stop();
    }


    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkCollision();
            move();
        }
        repaint();
    }

    // ------------------ KEY LISTENER --------------------

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT && !rightDirection) {
                leftDirection = true; upDirection = false; downDirection = false;
            }
            if (key == KeyEvent.VK_RIGHT && !leftDirection) {
                rightDirection = true; upDirection = false; downDirection = false;
            }
            if (key == KeyEvent.VK_UP && !downDirection) {
                upDirection = true; leftDirection = false; rightDirection = false;
            }
            if (key == KeyEvent.VK_DOWN && !upDirection) {
                downDirection = true; leftDirection = false; rightDirection = false;
            }
        }
    }
}
