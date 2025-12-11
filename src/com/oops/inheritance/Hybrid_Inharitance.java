package com.oops.inheritance;

 class Ox{
	 void work() {
		 System.out.println("Ox is plugging The field ");
	 }
 } 
 class Farmer extends Ox{
	 void run() {
		 System.out.println("Farmer running the Ox");
	 }
 }
interface Person{
	void eat();
}
interface Man{
	void show();
}
class Trader extends Farmer implements Person,Man {
	
	public void eat() {
		System.out.println("I am Eating");
	}
	public void show() {
		System.out.println("Show The ox");
	}
	void detail() {
		System.out.println("Work Completed Success fully ");
	}
}
public class Hybrid_Inharitance {

	public static void main(String[] args) {
		Trader trader = new Trader();

		trader.work(); 
		trader.run();
		trader.eat();
	    trader.show();
		trader.detail();
	}

}
