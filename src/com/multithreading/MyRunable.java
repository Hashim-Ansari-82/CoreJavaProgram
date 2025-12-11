package com.multithreading;

public class MyRunable implements Runnable{

    public void run(){
        for(int i=1; i<=1; i++){
            System.out.println("Child Thread ");
        }
    }
}
class ThreadDemo1{
    public static void main(String[] args) {

      MyRunable rd=new MyRunable();
      Thread t=new Thread();
      Thread t1=new Thread(rd);
      t.start();
      t.run();
      t1.start();
      t1.run();
      t1.start();
      rd.run();
      for(int i=1; i<=1; i++){
          System.out.println("Main Thread ");
      }
    }
}
