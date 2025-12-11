package com.variable;

public class Typecast {

	public static void main(String[] args) {
		
		System.out.println("Widening/implicit");
		
		int a=10;
		float b=a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Narrowing/Explicit");

		float f=19.2f;
		  int i=(int)f;
		  
		System.out.println(f);  
		System.out.println(i);
		
		System.out.println("Overflow");
		
		int c=130;
		byte y=(byte)c;
		
		System.out.println(c);
	    System.out.println(y);
			
	    System.out.println("Adding Lower Type");
	    
	    byte x=12;
	    byte z=12;
	    byte m=(byte)(x+z);
	    
	    System.out.println(m);
	}

}
