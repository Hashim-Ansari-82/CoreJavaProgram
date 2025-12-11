package com.logicalprogram;

import java.util.Scanner;

public class UserInputFibbonaciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int no=sc.nextInt();
        System.out.println("Your Fibbonaci Series   ");
        System.out.print(a+","+b);
        for(int i=1; i<=no; i++) {
            int sum=a+b;
            System.out.print(","+sum);
          a=b;
          b=sum;
        }
    }
}
