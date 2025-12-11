package com.oops.inheritance;

class Building{
	void address(){
		System.out.println("Koilsa Sant Kabir Nagar");
	}
}
class Room extends Building{
	void Price() {
		System.out.println("50k Only");
	}
}
public class SingleLevelInharitance {

	public static void main(String[] args) {
	 Room r=new Room();
	 r.address();
	 r.Price();
	}

}
