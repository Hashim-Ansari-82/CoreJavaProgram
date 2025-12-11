package com.controlstatement;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int no=sc.nextInt();
        int fact=1;
        for (int i=1;i<=5;i++){
            fact =fact*i;
        }
        System.out.println("Factoral No "+no+" is = "+fact);
        sc.close();
    }
}
