package com.innerclass;

             /*Instance Area Access Inner Class*/

class OuterClass2nd {

    class InnerClass2nd {
        public void m() {
            System.out.println("Inner class method ");
        }
    }

    public void m1() {
        System.out.println("Outer class method");
        InnerClass2nd i = new InnerClass2nd();
        i.m();
    }

    public static void main(String[] args) {

        OuterClass2nd o=new  OuterClass2nd();
        o.m1();
    }
}
