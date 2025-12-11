
package com.oops.inheritance;

class Fruit{
       String name;
       int price;
       Fruit(String name, int price){
           this.name =name;
           this.price =price;
       }
}
class Apple{
     Fruit fruit;
     Apple(Fruit fruit){
         this.fruit =fruit;
     }
         void show(){
             System.out.println("Fruit Name = "+fruit.name+"\n"+"Fruit Price Rs  = "+fruit.price+" Kg");
         }
     }
public class Association {
    public static void main(String[] args) {
        Fruit f=new Fruit("Apple",80);
        Apple a=new Apple(f);
        a.show();
    }
}
