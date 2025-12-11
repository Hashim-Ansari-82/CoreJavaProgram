package com.controlstatement;

import java.util.Scanner;

public class Swap2NoWithout3rdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st  Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("Before Swap --->"+"\n A = "+a+"\n B =  "+b);
       a=a+b;
       a=a-b;
       b=a-b;
        System.out.println("After Swap --->"+"\n A = "+a+"\n B =  "+b);
    }
}
