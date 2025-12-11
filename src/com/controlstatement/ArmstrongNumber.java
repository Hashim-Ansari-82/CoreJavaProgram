package com.controlstatement;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number :->      ");
        int no=sc.nextInt();
        int no1=no;
        int sum=0;
        int i=String.valueOf(no).length();
        while(no>0){
            int digit=no%10;
            sum+=Math.pow(digit,i);
          //  sum+=(digit*digit*digit);
            no=no/10;
        }
        if(no1==sum){
            System.out.println(no1+"  is Armstrong Number");
        }
        else
            System.out.println(no1+"   is not Armstrong Number");
    }
}
