package com.controlstatement;

import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year");
        int Year=sc.nextInt();
        if((Year%100==0 || Year%4==0) && (Year%100!=0)){
            System.out.println(Year+" is a Leap Year");
        }
        else
            System.out.println(Year+" is not a Leap Year");
        sc.close();
    }
}
