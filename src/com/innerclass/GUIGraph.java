package com.innerclass;

import java.awt.*;
import java.awt.event.*;

class GUIGraph {

    public static void main(String[] args) {
        Frame f=new Frame();
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                for(int i=1;i<=10; i++)
                    System.out.println("i am closing windows : "+i);
                System.exit(0);
            }
        });
        f.add(new Label("i am Create Executable Jar File!!"));
        f.setSize(500,500);
        f.setVisible(true);
    }
}
