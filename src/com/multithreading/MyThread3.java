package com.multithreading;

public class MyThread3 extends Thread{

}
class Thread3 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        MyThread3 mt=new MyThread3();
        System.out.println(mt.getName());
        Thread.currentThread().setName("Hashim Ansari");
        System.out.println(Thread.currentThread().getName());
       // System.out.println(10/0);
    }
}