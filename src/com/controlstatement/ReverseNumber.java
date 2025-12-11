package com.controlstatement;

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int no=sc.nextInt();
        int no1=no;
        int rev=0;
        while(no>0){
            int rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("Reverse No "+no1+" is = "+rev);
        sc.close();
    }
}
