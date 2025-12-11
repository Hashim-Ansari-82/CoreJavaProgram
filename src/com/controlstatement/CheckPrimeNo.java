package com.controlstatement;

import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int no=sc.nextInt();
        int count =0;
        for(int i=1;i<=no;i++){
            if(no%i==0) {
              count++;
            }
        }
      if(count==2){
          System.out.println("Number "+no+" is Prime Number ");
      }
        else {
            System.out.println("Number "+no+" is not Prime Number ");
        }
    }
}
