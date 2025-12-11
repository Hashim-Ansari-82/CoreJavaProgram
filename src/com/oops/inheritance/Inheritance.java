package com.oops.inheritance;

class Bank{
    void show(){
        System.out.println("What is your Name");
    }
}
class AccountHolder extends Bank{
    void detail(){
        System.out.println("Where are You Live");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        AccountHolder ah=new AccountHolder();
        ah.show();
        ah.detail();
    }
}
