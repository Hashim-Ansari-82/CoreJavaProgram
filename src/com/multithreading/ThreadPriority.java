package com.multithreading;


class Priority extends Thread{

}
public class ThreadPriority {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());
      //  Thread.currentThread().setPriority(18);
        Thread.currentThread().setPriority(10);

          Priority p=new Priority();
        System.out.println(p.getPriority());
    }
}
