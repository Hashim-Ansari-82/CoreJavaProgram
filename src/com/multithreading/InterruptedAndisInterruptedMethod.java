package com.multithreading;

public class InterruptedAndisInterruptedMethod extends Thread{

    public  void run(){

       /* System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());*/
        System.out.println(Thread.currentThread().isInterrupted());

        try{
            for(int i=1; i<=5; i++){
                System.out.println("Child Thread");
                sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        InterruptedAndisInterruptedMethod i=new InterruptedAndisInterruptedMethod();
        i.start();
        i.interrupt();
    }
}
