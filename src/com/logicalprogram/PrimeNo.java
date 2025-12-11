package com.logicalprogram;

public class PrimeNo {

	public static void main(String[] args) {
	
		        int a=17;
		        int count=0;
		        for(int i=1; i<=a; i++)
		        {
		            if(a%i==0) {
		            count++;  
		            }
		           
		        }
		        if(count==2) {
		       System.out.println(a+" is prime no");
		    }
		        else {
		        	System.out.println(a+" Is Not Prime no");
		        	}
		        }
		}
