package com.innerclass;

class NestedInnerClass {

    class FirstInner {

        class SecondInner {

            public void show() {
                System.out.println("I am Last Inner Class");
            }
        }

    }
}
class NestedInnerClass2nd{

    public static void main(String[] args) {

        NestedInnerClass n=new NestedInnerClass();
        NestedInnerClass.FirstInner f=n.new FirstInner();
        NestedInnerClass.FirstInner.SecondInner s=f.new SecondInner();
        s.show();
    }
}
