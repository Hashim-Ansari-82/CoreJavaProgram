package com.multithreading;

public class SleepMethod extends Thread {

    public void run(){
        for(int i=1; i<=3; i++){
            try{
                Thread.sleep(1000);
                System.out.println("Hashim Ansari");
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException{
        SleepMethod s=new SleepMethod();
        s.start();
        for(int i=1; i<=3; i++) {
            System.out.println("Koilsa S K Nagar");
        }
    }
}
