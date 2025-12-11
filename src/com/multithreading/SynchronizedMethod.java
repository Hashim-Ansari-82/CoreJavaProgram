package com.multithreading;

class Synchronized extends Thread{

    int a=10;
    synchronized public void run(){
        for(int i=2; i<=a; i++){
            if(i%2==0) {
                System.out.println(i+" Even number ");
            }
            else{
                System.out.println("\t"+i+" Odd number");
            }
        }
    }
}
public class SynchronizedMethod {

    public static void main(String[] args){

        Synchronized s=new Synchronized();
        s.start();
        System.out.println(" Second Thread ");
        Synchronized s1=new Synchronized();
        s1.start();
    }
}
