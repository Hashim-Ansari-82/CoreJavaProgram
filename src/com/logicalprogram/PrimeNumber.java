package com.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Starting number");
	 int a=sc.nextInt();
	 for(int i=2; i<=a; i++) {
	     boolean isPrime=false;

	   for(int j=2; j<=i/2; j++) {
		   if(i%j==0) {
		   isPrime=true;
	       break;   
	   }
	   }
	   if(isPrime==false){
		  System.out.print(i+",");
		  sc.close();
	   }
	}
	 }
	
}
       