package com.oops.inheritance;

class Station{
	void show() {
		System.out.println("There Have No Passanger in Station");
	}
}
class Train extends Station {
	void display() {
		System.out.println("Look the Train");
	}
}
class Passanger extends Train{
	void Speed() {
		System.out.println("Speed is 150 k/m");
	}
} 
public class MultiLevel_Inharitance {
	public static void main(String[] args) {
        
		Passanger passanger = new Passanger();
		passanger.show();
		passanger.display(); 
		passanger.Speed();
	}
}
