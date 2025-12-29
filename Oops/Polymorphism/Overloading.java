package Oops.Polymorphism;


class Overloading{
    public void show(int a, double d){
      System.out.println("Int And double arg Parameter");
    }
    public void show(double a,char b){
     System.out.println("double and int arg parameter "+b);
    }
    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.show(10.9,'1');
    }
}