package com.controlstatement;

import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year ");
        int year=sc.nextInt();
        if(year%4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                }
                else {
                    System.out.println(year + " not is a Leap Year");
                }
            }
                else {
                System.out.println(year + " is a Leap Year");
            }
        }
        else{
            System.out.println(year+" is not  a Leap Year");
        }
        sc.close();
    }
}
