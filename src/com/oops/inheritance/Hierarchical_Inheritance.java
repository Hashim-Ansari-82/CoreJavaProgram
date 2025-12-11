package com.oops.inheritance;

class Crop{
	void show(){
		 System.out.println("Look The Crop");
	}
}
class RiceCrop extends Crop{
	void price () {
		System.out.println("Rice Rs 50 Kg");
	}
} 
class WheatCrop extends Crop{
	void rate() {
		System.out.println("Wheat Rs 40 Kg");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		  RiceCrop riceCrop = new RiceCrop();
          riceCrop.show();
          riceCrop.price(); 
          
          WheatCrop wheatCrop = new WheatCrop();
          wheatCrop.show();
          wheatCrop.rate();
	}

}
