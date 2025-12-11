package com.logicalprogram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int a=sc.nextInt();
        int b=a;
        int res=0;
        while(a!=0){
            int rem=a%10;
              res=res*10+rem;
              a=a/10;
        }
        if(res==b){
            System.out.println(res+" Is Palindrome Number");
        }
        else
            System.out.println(res+" Is not a Palindrome Number");
        sc.close();
    }
}
