package com.oops.encapsulation;

class ATM{
	private int pin;
	private double balance;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
        this.pin=pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
      ATM atm = new ATM();
      atm.setPin(7233);
      atm.setBalance(10000);
      System.out.println("Your Pin is : "+atm.getPin());
     System.out.println("Your Balance is : "+atm.getBalance());
	}

}
