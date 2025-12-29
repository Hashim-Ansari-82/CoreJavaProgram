package Oops.Inharitance;

interface Highway{
    public void cleaning();
}
interface Bike{
    public void speed();
}
class Vehicle implements Highway,Bike {
    public void cleaning(){
        System.out.println("Clean The highway");
    }
    public void speed(){
        System.out.println("Bike ride slow");
    }
} 
class MultipleInharitance{
     public static void main(String[] args) {
     Vehicle v=new Vehicle();
     v.cleaning();
     v.speed();
     }
}