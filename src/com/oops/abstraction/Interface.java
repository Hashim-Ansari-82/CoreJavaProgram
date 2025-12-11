package com.oops.abstraction;

interface Room{
	  void kitchen();  
}
interface BedRoom{
	void bed();
}

class WashRoom implements Room,BedRoom{
	  public void kitchen() {
		   System.out.println("Your kitchen is Dirty");
	   }
	 public void bed() {
		 System.out.println("Your Bed is Luckgry");
	 } 
}
public class Interface {

	public static void main(String[] args) {
	
      WashRoom washRoom = new WashRoom();
      washRoom.kitchen();
      washRoom.bed();
	}

}
