package Oops.Constructor;

public class ConstructorChaining {
       
       ConstructorChaining(){
        this(12);
          System.out.println("no args constructor"); //char,double,float,
       }
       ConstructorChaining(int a){
        this(12.5f);
        System.out.println("int args constructor");
       }
       ConstructorChaining(double d){
        this('R');
       System.out.println("double args constructor");
       }
       ConstructorChaining(float f){
        this(12.5);
        System.out.println("float args constructor");
       }
       ConstructorChaining(char c){
        System.out.println("char args constructor");
       }
      public static void main(String[] args) {
        ConstructorChaining ch=new ConstructorChaining();
      }


}

