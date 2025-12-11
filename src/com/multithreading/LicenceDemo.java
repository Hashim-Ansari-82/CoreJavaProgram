package com.multithreading;

class Medical extends Thread{

    public void run() {

        try {
            System.out.println("Start Medical Checkup");
            sleep(3000);
            System.out.println("Complete Medical Checkup");
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class TestDrive extends Thread{

    public void run() {

        try {
            sleep(4000);
            System.out.println("Start Test Drive");
            sleep(5000);
            System.out.println("Complete Test drive");
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class OfficerSign extends Thread{

    public void run() {

        try {

            sleep(3000);
            System.out.println("Officer Take File");
            sleep(4000);
            System.out.println("Officer complete Sign");
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {

        Medical m=new Medical();
        m.start();
        m.join();

        TestDrive t=new TestDrive();
        t.start();
        t.join();

        OfficerSign o=new OfficerSign();
        o.start();
    }
}
