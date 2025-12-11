package com.logicalprogram;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
	
			      Scanner sc=new Scanner(System.in);
			      System.out.println("Enter a Number");
			      int a=sc.nextInt();
					 if(a%4==0 && a%400==0 || a%100!=0){
					  System.out.print(a+" is Leap year");
					 }
					 else{
					  System.out.println(a+" Is not a Leap Year");
					  sc.close();
					 }
			   }
			}

