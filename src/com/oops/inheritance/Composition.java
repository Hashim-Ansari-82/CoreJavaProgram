package com.oops.inheritance;

class Mobile {
       String brand;
       int price;
       Mobile(String brand, int price){
           this.brand=brand;
           this.price=price;
       }
}
class Charger{
    Mobile m=new Mobile("I Phone 17 ",1);
    String brand;
    int price;
    Charger(String brand , int price){
        this.brand=brand;
        this.price=price;
    }
    void show(){
        System.out.println("Mobile Brand = "+m.brand+"\n"+"Mobile Price = "+m.price+"Lakh");
        System.out.println("Charger Brand = "+m.brand+"\n"+"Charger Price = "+m.price+"K");
    }
}
public class Composition {
    public static void main(String[] args) {
        Charger c =new Charger("Apple = ",5);
        c.show();
    }
}
