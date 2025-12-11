package com.logicalprogram;

public class Var_arg_Sum {
		static void sum(int...a){
		 int total=0;
		 for(int i:a) {
			 total +=i  ;                                
		 }
			System.out.println("For each loop\t=   "+total);
		 }
		static void add(int...a){
			int total=0;
			for(int i=0;i<a.length;i++) {
				total +=a[i]  ;                                
			}
			System.out.println("For loop\t=   "+total);
		}
	   public static void main(String[] args) {
	      sum(2,3,4,4);
	      add(2,4,4,4);
	}
}

