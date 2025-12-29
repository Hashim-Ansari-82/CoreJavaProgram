package Oops.Polymorphism;

class Math{
    public Math Multiplay(double d,int a){
     System.out.println(d*a);
     return this;
    } 
}
class Power extends Math{
    public Power Multiplay(double d,int a){
      System.out.println(2*d*a);
      return this;
    }
}
class Overriding{
  public static void main(String[] args) {
    Math m=new Power().Multiplay(12, 5);
    
  }
}