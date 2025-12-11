package com.exceptionhandling;

import java.util.Scanner;

class TooYoungException extends  RuntimeException{

    TooYoungException(String msg){
        super(msg);
    }
}
class TooOldException extends RuntimeException{

    TooOldException(String msg){
        super(msg);
    }
}
public class CustomizedException {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age=sc.nextInt();

        if(age>60){
            throw new TooYoungException("Your Age is out of marriage");
        }
        else if(age<18){
            throw new TooOldException("Please wait some time");
        }
        else{
            System.out.println("You Can marriage");
        }
    }
}
