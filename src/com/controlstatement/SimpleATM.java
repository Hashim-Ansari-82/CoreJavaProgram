package com.controlstatement;

import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=0;
        while(true) {
            System.out.println("Select an Option");
            System.out.println("1 check balance");
            System.out.println("2 deposite Money");
            System.out.println("3 withdeaw Money ");
            System.out.println("4 exit ");
            System.out.println("Enter Your choice...?");
            int choice =sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Your current balance is "+balance+" Rs");
            break;
            case 2:
                System.out.println("Enter deposite amount");
                double deposite=sc.nextDouble();
                if(deposite >0){
                    balance+=deposite; //balance =balance+deposite
                    System.out.println("Amout Deposite Successfully");
                    System.out.println("Current Balance is "+balance+" Rs");
                }
                else{
                    System.out.println("invalid deposite amount");
                }
                break;
            case 3:
                System.out.println("Enter withdraw money");
                double withdraw=sc.nextDouble();
            if(balance >= withdraw && withdraw >0){
                balance-=withdraw;
                System.out.println("Amount withdraw Successfully");
                System.out.println("Your Current Balance is "+balance+" Rs");
            }
            else{
                System.out.println("invalid withdraw amount");
            }
            break;
            case 4:
                System.out.println("Thanks for using Atm");
            sc.close();
          return;
            default :
                System.out.println("Invaid Option");
        }
            System.out.println("<------------------------->");
        }

    }
}
