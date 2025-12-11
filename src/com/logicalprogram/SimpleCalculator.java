package com.logicalprogram;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number ");
        int no1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int no2=sc.nextInt();
        System.out.println("Choose a Symbol (+,-,*,/,%)");
        String sym=sc.next();
        switch (sym){
            case "+":
                System.out.println("Addition = "+(no1+no2));
                break;
            case "-":
                System.out.println("Substraction = "+(no1-no2));
                break;
            case "*":
                System.out.println("Multiplication = "+(no1*no2));
                break;
            case "/":
                System.out.println("Devision = "+(no1/no2));
                break;
            case "%":
                System.out.println("Addition = "+(no1%no2));
                break;
            default:
                System.out.println("Invalid Symbol");
                break;
        }
        sc.close();
    }
}
