package com.multithreading;

class ThreadGroupDemo extends Thread{

  ThreadGroupDemo(ThreadGroup g, String name){
    super(g,name);
  }
    public void run(){
      System.out.println("Child Thread");
    try{
       Thread.sleep(2000);
    }
    catch(InterruptedException e){
      System.out.println(e.getMessage());
    }
  } 
 }
class ThreadDemo{
  public static void main(String[] args)throws InterruptedException{
     
    ThreadGroup pg=new ThreadGroup("Parrent Group");
    ThreadGroup cg=new ThreadGroup(pg, "Child Group");

    ThreadGroupDemo b=new ThreadGroupDemo(pg, "Child Thread1 ");
    ThreadGroupDemo b1=new ThreadGroupDemo(pg, "Child Thread 1");
    b.start();
    b1.start();

    System.out.println(pg.activeCount());
    System.out.println(pg.activeGroupCount());
    pg.list();
    Thread.sleep(4000);
    System.out.println(pg.activeCount());
    System.out.println(pg.activeGroupCount());
    pg.list();
   }
}
