package com.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String str=sc.nextLine();
        String str1="";
        for(int i=str.length()-1; i>=0; i--){
            str1 +=str.charAt(i);
        }
        System.out.println(str1+" Is Your Reverse String");
        sc.close();
    }
}
