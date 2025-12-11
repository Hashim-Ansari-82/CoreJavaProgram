package com.multithreading;

public class YieldMethod extends Thread {

    public void run(){

        Thread.yield();
        Thread.currentThread().setName("Hashim Ansari");
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }

    }

    public static void main(String[] args) {

        YieldMethod y=new YieldMethod();
        y.start();
      //  Thread.yield();
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
