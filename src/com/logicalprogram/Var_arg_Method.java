package com.logicalprogram;

public class Var_arg_Method {
	
	 static void multiply(int... no) {
		 int multiply=1;
		 for(int i:no) {
			 multiply*=i;
		 }
		 System.out.println("For each loop \t=   "+multiply);
	 }
	 static void into(int... no) {
		 int into=1;
		 for(int i=0;i<no.length;i++) {
			 into*=no[i];
		 }
		 System.out.println("For loop\t=   "+into);
	 }
     public static void main(String[] args) {
		multiply(2,8,3);
		into(2,8,3);
	}
}
