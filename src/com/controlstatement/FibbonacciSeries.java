package com.controlstatement;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no1=0;
        int no2=1;
        System.out.println("Enter  a Number ");
        int no3=sc.nextInt();
        System.out.println("Your Fibbonacci Series");
        System.out.print(no1+" "+no2);
        for(int i=1;i<=no3;i++){
           int sum=no1+no2;
            System.out.print(" "+sum);
            no1=no2;
            no2=sum;
        }
        sc.close();
    }
}
