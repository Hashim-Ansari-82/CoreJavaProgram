package com.controlstatement;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=str,str2="";
        for (int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        System.out.println("Reverse String "+str1+" is = "+str2);
        sc.close();
    }
}
