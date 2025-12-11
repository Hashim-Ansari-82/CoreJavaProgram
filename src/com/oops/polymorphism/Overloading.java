package com.oops.polymorphism;

public class Overloading {

    int show(int a,Integer b){
        System.out.println(a+b);
        return 0;
    }
     void  show(Character m, int b){
         System.out.println(m+" "+b);
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();

        System.out.println(o.show(40,66));

    }


}
