package com.exceptionhandling;

public class TryCatchDemo {
    public static void main(String[] args) {


        System.out.println("Hii");
        try {
            System.out.println(10 / 0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(10/5);
        }
        System.out.println("By");
    }
}
