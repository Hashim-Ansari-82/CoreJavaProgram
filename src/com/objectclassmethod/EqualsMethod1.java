package com.objectclassmethod;

                            /*Without override equals method*/

public class EqualsMethod1 {

    String name;
    int rollno;

    EqualsMethod1(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {

        EqualsMethod1 e=new EqualsMethod1("Hashim",12);
        EqualsMethod1 e1=new EqualsMethod1("Rani",10);
        EqualsMethod1 e2=new EqualsMethod1("Hashim",12);
        EqualsMethod1 e3=e;

        System.out.println("1 --> "+e.equals(e1));
        System.out.println("2 --> "+e.equals(e2));
        System.out.println("3 --> "+e.equals(e3));
        System.out.println("4 --> "+e.equals("Rani"));
        System.out.println("4 --> "+e.equals(null));
    }
}
