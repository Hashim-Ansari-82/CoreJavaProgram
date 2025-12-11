package com.innerclass;

public class MethodInnerClass1st {

    public void show(){

        class InnerClass{

            public void sum(int x, int y){
                System.out.println("sum : "+(x+y));
            }
        }
        InnerClass i=new InnerClass();
        i.sum(10,20);
        i.sum(100,200);
        i.sum(1000,2000);
        i.sum(100000,200000);
        i.sum(1000000,2000000);
    }

    public static void main(String[] args) {
        MethodInnerClass1st m=new MethodInnerClass1st();
        m.show();
    }

}
