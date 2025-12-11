package com.variable;

public class InstanceVariable {

	String name;
	    int age;
	    
   InstanceVariable(String name ,int age){
	   this.name=name;
	    this.age=age;
   }	    
	  void show(){
		  System.out.println("Name : "+name);
		  System.out.println("Age  : "+age);
	  }  
	
	
	public static void main(String[] args) {
		
		InstanceVariable i=new  InstanceVariable("Hashim Ansari ",+19);
		i.show();
		
		InstanceVariable i1=new  InstanceVariable("Hashim Ansari ",+18);
		i1.show();
		
	}

}
