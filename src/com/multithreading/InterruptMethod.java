package com.multithreading;


public class InterruptMethod extends Thread{

    public void run(){

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread");
                sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){

        InterruptMethod im=new InterruptMethod();
        im.start();
        im.interrupt();
    }
}
