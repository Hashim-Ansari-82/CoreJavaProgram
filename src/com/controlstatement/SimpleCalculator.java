package com.controlstatement;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        double a=sc.nextDouble();
        System.out.println("Enter 2nd number");
        Double b=sc.nextDouble();
        System.out.println("Choose An Operator : +,-,/,%");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '+' :
                System.out.println("Your Choice Is "+choice+" Result = "+(a+b));
            break;
            case '-' :
                System.out.println("Your Choice Is "+choice+" Result = "+(a-b));
            break;
            case '*' :
                System.out.println("Your Choice Is "+choice+" Result = "+(a*b));
            break;
            case '/' :
                System.out.println("Your Choice Is "+choice+" Result = "+(a/b));
            break;
            case'%' :
                System.out.println("Your Choice Is "+choice+" Result = "+(a%b));
            break;
            default:
                System.out.println("Invalid Character");
        }
    }
}
