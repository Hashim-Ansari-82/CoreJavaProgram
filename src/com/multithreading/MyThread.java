package com.multithreading;

public class MyThread extends Thread{

    public void run(){
        for(int i=1; i<=2;i++) {
            System.out.println("Run executed  by " + Thread.currentThread().getName());
        }
    }
}
class Threading{
    public static void main(String[] args) {

        MyThread mt=new MyThread();
        mt.start();
        for(int i=1; i<=2;i++) {
            System.out.println("Main executed  by " + Thread.currentThread().getName());
        }
    }
}
