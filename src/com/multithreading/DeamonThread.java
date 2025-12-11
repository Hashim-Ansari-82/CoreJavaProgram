package com.multithreading;

public class DeamonThread extends Thread {

    public void run(){

        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        }
        else{
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        System.out.println("Main Thread");
        DeamonThread dt=new DeamonThread();
        dt.setDaemon(true);
        dt.start();
    }
}
