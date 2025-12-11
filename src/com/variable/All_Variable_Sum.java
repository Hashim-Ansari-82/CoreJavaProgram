package com.variable;

public class All_Variable_Sum {
	
	static int a=10;
	       int b=20;
	       
	   void sum() 
	   {
		 int b=15;
		 System.out.println(a+b+this.b);
	   } 
	   static void add() 
	   {
		 System.out.println(a);    
	   }

	public static void main(String[] args) {
	
		All_Variable_Sum a=new All_Variable_Sum();
		a.sum();
		All_Variable_Sum.add();
	}

}
