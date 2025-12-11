package com.variable;

public class StaticVariable {
	 
	static int age;
	static String name;
	
	void show() {
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}

	public static void main(String[] args) {
		
		StaticVariable s=new StaticVariable();
    	StaticVariable s1=new StaticVariable();
	
    	StaticVariable.name="Hashim Ansari";
		StaticVariable.age=20;
		
		s.show();
		s1.show();
		
	}
}
