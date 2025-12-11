package com.oops.polymorphism;

class Garden {
	  void fruit(String name ) {
		System.out.println("Fruit name is = "+name);
	  }
	  void fruit(String name1,String name ) {
		  System.out.println("Fruit name1 is = "+name1+"\n"+"Fruit name = "+name);
	  }
}


public class MethodOverLoading {

	public static void main(String[] args) {
		Garden garden = new Garden();
              garden.fruit("Mango","Apple");
	}

}
