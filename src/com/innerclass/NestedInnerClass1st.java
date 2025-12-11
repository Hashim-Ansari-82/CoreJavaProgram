package com.innerclass;

class NestedInnerClass1st{

    class FirstInner{

        class SecondInner{

            public void show(){
                System.out.println("I am Last Inner Class");
            }
        }
    }

    public static void main(String[] args) {

        new NestedInnerClass1st().new FirstInner().new SecondInner().show();
    }
}
