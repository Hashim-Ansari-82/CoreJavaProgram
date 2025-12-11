package com.oops.polymorphism;

class Animal {
	void eat() {
		System.out.println("Animal is Eating......!");
	}
}
class Goat extends Animal{
	void eat() {
		super.eat();
		System.out.println("Goat eating grass....!");
	}
}

public class MethodOverRiding {
    public static void main(String[] args) {
		Animal a=new Goat();
			a.eat();
	}
}
