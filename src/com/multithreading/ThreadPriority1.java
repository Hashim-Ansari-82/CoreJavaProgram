package com.multithreading;

class Priority1 extends Thread{

    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

public class ThreadPriority1 {
    public static void main(String[] args) {

        Priority1 p=new Priority1();
        p.setPriority(10);
        p.start();
        for(int i=1; i<=5; i++){
            System.out.println("Main Thread");

        }
    }
}
