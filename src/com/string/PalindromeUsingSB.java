package com.string;

import java.util.Scanner;

public class PalindromeUsingSB {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");

        String str1=sc.nextLine();

        StringBuffer sb=new StringBuffer(str1);
        String rev=sb.reverse().toString();

        if(str1.equals(rev)){
            System.out.println(rev+" is Palindrome");
        }
        else{
            System.out.println(rev+" not a Palindrome");
        }
    }
}
