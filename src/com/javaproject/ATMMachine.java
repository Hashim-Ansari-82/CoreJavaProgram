package com.javaproject;

import java.util.Scanner;

class ATM{
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
              correctPin();
          }
      }
      public void correctPin(){
          System.out.println("              <-------------Please Enter correct Pin------------->");
          Scanner sc=new Scanner(System.in);
          int enteredPin=sc.nextInt();
          if(enteredPin==pin){
              menu();
          }
          else{
              System.out.println("              <----------------- Wrong pin ------------->");
              System.out.println();
              correctPin();
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
          if(option==1){
              checkBalance();
          }
          else if(option==2){
              withdrawMoney();
          }
          else if(option==3){
              depositeMoney();
          }
          else if (option==4) {
              System.out.println("<----------------Thanks for visit ATM---------------->");
              sc.close();
          }
          else {
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
public class ATMMachine {
    public static void main(String[] args) {
        ATM a=new ATM();
        a.checkPin();
    }
}
