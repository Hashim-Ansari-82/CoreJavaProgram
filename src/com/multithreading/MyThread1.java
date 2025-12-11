package com.multithreading;

public class MyThread1 extends Thread{

    public void run(){
            System.out.println("No args Method");
    }
    public void run(int a){
        System.out.println("Args Method");
    }
}
class Threading1{
    public static void main(String[] args) {

        MyThread1 mt=new MyThread1();
        mt.start();
    }
}
