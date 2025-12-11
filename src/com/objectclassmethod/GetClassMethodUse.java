package com.objectclassmethod;
import  java.lang.reflect.*;


public class GetClassMethodUse {

    public static void main(String[] args) {
        int count = 0;
        Object o=new String("Hashim");
        Class c=o.getClass();
        System.out.println("Fully Qualified Name of Class : "+c.getName());

        Method[] m=c.getDeclaredMethods();
        System.out.println("Method Information");

        for(Method m1:m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The Number of Method : "+count);
    }
}
