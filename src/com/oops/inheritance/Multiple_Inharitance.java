package com.oops.inheritance;

interface Weapon{
	void use();
}
interface Character{
	void attack();
}
class Warrior implements  Weapon,Character{
	public void use() {
		System.out.println("Warrior use a Sword");
	}
	public void attack() {
		System.out.println("Attack the Enemy");
	}
}

public class Multiple_Inharitance {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		warrior.use();
		warrior.attack();
	}

}
