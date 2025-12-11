package com.javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Path2D;

public class HumanHeart extends JPanel {

    private double t = 0;
    private Timer timer;
    private boolean starVisible = true;

    public HumanHeart() {

        timer = new Timer(80, e -> {
            t += 0.10;

            if (t >= 2 * Math.PI) {
                t = 2 * Math.PI;
            }

            starVisible = !starVisible;
            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // ⭐ HEART LINE THICKNESS = 30 (BOLD)
        g2.setStroke(new BasicStroke(30, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        int scale = 18;
        int centerX = width / 2;
        int centerY = height / 2;

        // ❤️ Smooth Heart Path
        Path2D.Double heartPath = new Path2D.Double();

        boolean firstPoint = true;

        for (double angle = 0; angle < t; angle += 0.01) {

            double x = 16 * Math.pow(Math.sin(angle), 3);
            double y = 13 * Math.cos(angle) - 5 * Math.cos(2 * angle)
                    - 2 * Math.cos(3 * angle) - Math.cos(4 * angle);

            int drawX = centerX + (int) (x * scale);
            int drawY = centerY - (int) (y * scale);

            if (firstPoint) {
                heartPath.moveTo(drawX, drawY);
                firstPoint = false;
            } else {
                heartPath.lineTo(drawX, drawY);
            }

            // ⭐ Twinkling stars on border AFTER complete
            if (t >= 2 * Math.PI && starVisible) {
                drawStar(g2, drawX - 8, drawY - 8, 35);
            }
        }

        // ❤️ Bold Heart Outline
        g2.setColor(Color.RED);
        g2.draw(heartPath);

        // ✨ Text inside heart
        if (t >= 2 * Math.PI) {
            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.BOLD, 40));

            String text = "Hashim Ansari";
            FontMetrics fm = g2.getFontMetrics();

            int textX = centerX - fm.stringWidth(text) / 2;
            int textY = centerY + fm.getAscent() / 2;

            g2.drawString(text, textX, textY);
        }
    }

    // ⭐ Star shape
    private void drawStar(Graphics2D g2, int x, int y, int size) {
        g2.setColor(Color.YELLOW);

        int[] xs = {
                x + size/2, x + size*3/5, x + size, x + size*2/3, x + size*3/4,
                x + size/2, x + size/4, x + size/3, x, x + size*2/5
        };

        int[] ys = {
                y, y + size/3, y + size/3, y + size/2, y + size,
                y + size*3/4, y + size, y + size/2, y + size/3, y + size/3
        };

        g2.fillPolygon(xs, ys, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Super Bold Heart with Stars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HumanHeart panel = new HumanHeart();
        panel.setBackground(Color.WHITE);

        frame.add(panel);
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
