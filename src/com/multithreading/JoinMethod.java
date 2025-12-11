package com.multithreading;

public class JoinMethod implements Runnable{

    static Thread t1;
    public void run(){

        try {
         // t1.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread");
                Thread.currentThread().sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        JoinMethod j=new JoinMethod();
        Thread t=new Thread(j);
        t1=Thread.currentThread();
        t.start();
        t.join();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread");
                Thread.currentThread().sleep(1000);
            }

    }
}
