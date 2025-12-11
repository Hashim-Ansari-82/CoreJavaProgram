package com.innerclass;

public class MethodInnerClass2nd {

    int x=100;
    static int y=20;

    public static void show(MethodInnerClass2nd m){
        int x=10;
       // MethodInnerClass2nd m=new MethodInnerClass2nd();
        class InnerClass{

            public void display(){
                System.out.println(x);
                System.out.println(y);
                System.out.println(m.x);
            }
        }
        new InnerClass().display();
    }

    public static void main(String[] args) {

        MethodInnerClass2nd m=new MethodInnerClass2nd();
          show(m);
    }

}
