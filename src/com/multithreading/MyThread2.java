package com.multithreading;

public class MyThread2 extends Thread{

    public void run(){
            System.out.println("Run Method");
    }
    public void start(){
       // super.start();
        System.out.println("Start Method");
    }
}
class Threading2{
    public static void main(String[] args) {

        MyThread2 mt=new MyThread2();
        mt.start();
        System.out.println("Main method");
    }
}