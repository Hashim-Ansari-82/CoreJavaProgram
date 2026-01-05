package Oops.Polymorphism;

class A{
  public void show(){
     System.out.println("hii");
  }   
}
class B extends A{
   public void show(){
   System.out.println("byy");
   }
}
public class MethodOverriding {
    public static void main(String[] args) {
    String name="hashim";
    name.concat("Ansari");
    System.out.println(name);
    // A a = new A();
        // a.show();
        // A a1 = new B();
        // a1.show();
        A[] a1=new A[4];            
        a1[0]=new A();
        a1[1]=new B();
        for (A a2 : a1) {
            a2.show();
        }

    }
}
            