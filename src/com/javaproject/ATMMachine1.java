package com.javaproject;

import java.util.Scanner;

class Atm{
    double balance;
    int pin=7025;
    public void checkPin() {
        Scanner sc=new Scanner(System.in);
        System.out.println("				<------------- Enter your pin ----------->");
        int checkpin=sc.nextInt();
        if(checkpin==pin) {
            menu();
        }
        else {
            System.out.println("				       <----------- Wrong pin ------------>");
            correctPin();
        }
    }
    public void correctPin() {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("				<---------- Please Enter correct Pin --------->");
        int checkpin=sc.nextInt();
        if(checkpin==pin) {
            menu();
        }
        else {
            System.out.println("					<----------- Wrong pin ------------>");
            correctPin();
        }
    }
    public void menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("					   <--------- Choose an Option ----------->");
        System.out.println();
        System.out.println("		1.<---------- Withdraw Amount ---------->"+"		"+"     2.<---------- Check Balance ---------->");
        System.out.println();
        System.out.println("		3.<---------- Deposite Money  ---------->"+"		"+"     4.<--------------- Exit ------------->");

        int option=sc.nextInt();
        switch(option) {
            case 1:
                withdrawMoney();
                break;
            case 2:
                checkBalance();
                break;
            case 3:
                depositeMoney();
                break;
            case 4:
                System.out.println("				<-----------------Thanks Visit again --------------->");
                sc.close();
                break;
            default :
                System.out.println("				<---------- Plese Enter Valid Option ------------>");
        }
    }
    public void withdrawMoney() {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 				  <---------- Enter your withdraw Money ------------->");
        double amount=sc.nextDouble();
        if(balance>=amount && amount>0) {
            balance-=amount;
            System.out.println("		  	 <------------ Amount withdraw Successfully ------------>");
            System.out.println();
        }
        else {
            System.out.println("	     			 <------------ Insufficent Balance ------------->");
            System.out.println();
        }
        menu();
    }
    public void checkBalance() {
        System.out.println("		     	 <------------- Your current balance is Rs = "+balance+" --------------->");
        System.out.println();
        menu();
    }
    public void depositeMoney() {
        Scanner sc=new Scanner(System.in);
        System.out.println("			   <------------ Enter your Deposite Amount -------------->");
        double amount=sc.nextDouble();
        if(amount>0) {
            balance+=amount;
            System.out.println("		        <------------ Amount deposite Successfully ------------>");
            System.out.println();
        }
        else {
            System.out.println("	    	  	<------------ Enter valid amount ----------------->");
        }
        menu();
    }
}

class ATM1{
    float balance;
    int pin =8670;

    public void checkPin(){
        System.out.println("              <-------------Please Enter Your Pin------------->");
        Scanner sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(enteredPin==pin){
            menu();
        }
        else{
            System.out.println("              <----------------- Wrong pin ------------->");
            System.out.println();
            checkPin();
        }
    }
    public void menu(){
        System.out.println("              <---------------Enter Your Choice-------------->");
        System.out.println();
        System.out.println("1. <-----Check Balance----->"+"                                   "+"2.<-----Withdraw Money----->");
        System.out.println();
        System.out.println("3. <-----Deposite Money-----> "+"                                 "+"4. <----------Exit---------->");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
       switch (option) {
           case 1:
               checkBalance();
               break;
           case 2:
               withdrawMoney();
               break;
           case 3:
               depositeMoney();
               break;
           case 4:
               System.out.println("<---------------Thanks for using ATM--------------->");
               System.exit(0);
               break;
           default:
               System.out.println("              <---------Please  Enter  Valid option--------->");
               System.out.println();
               menu();
           }
       }
    public void checkBalance(){
        System.out.println("              <--------Your Current Balance is Rs "+balance+"--------->");
        System.out.println();
        menu();
    }
    public void withdrawMoney(){
        System.out.println("              <------------Enter Amount ------------->");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount<=balance){
            balance-=amount;
            System.out.println("                  <-------Amount withdraw Successfully--------->");
        }
        else {
            System.out.println("                  <------------Insufficent balance----------->");
        }
        System.out.println();
        menu();
    }
    public void depositeMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("              <----------Enter your Amount---------->");
        float amount=sc.nextFloat();
        balance+=amount;
        System.out.println("              <------------Money Deposite Successfully----------->");
        System.out.println();
        menu();
    }
}
public class ATMMachine1 {
    public static void main(String[] args) {
        ATM a=new ATM();
        a.checkPin();
    }
}
