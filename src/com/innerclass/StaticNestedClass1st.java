package com.innerclass;

public class StaticNestedClass1st {

    static class Nested1st {
        public void show() {
            System.out.println("I don't want Outer class for execute !!");
        }
    }

    public static void main(String[] args) {
        Nested1st n=new Nested1st();
        n.show();
    }
}

/*
class Demo{
    public static void main(String[] args) {
        StaticNestedClass.Nested1st n=new StaticNestedClass.Nested1st();
        n.show();
    }
}*/
