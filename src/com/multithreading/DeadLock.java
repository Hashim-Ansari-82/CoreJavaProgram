package com.multithreading;

class A{
    public synchronized void d(B b){
        System.out.println("thread 1 start execution of d() method");
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){}
        System.out.println("Thread wait to start b last() ");
        b.last();
    }
    public synchronized void last(){
        System.out.println("A last method");
    }
}
class B{
    public synchronized void d1(A a){
        System.out.println("thread 2 start execution of d() method");
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){}
        System.out.println("Thread wait to start A last() ");
        a.last();
    }
    public synchronized void last(){
        System.out.println("A last method");
    }
}
class DeadLock extends Thread{
    A a=new A();
    B b=new B();
    public void m1(){
        this.start();
        a.d(b);
    }
    public void run(){
        b.d1(a);
    }
    public static void main(String[] args) {
        DeadLock b=new DeadLock();
        b.m1();
    }
}


