package com.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Object> v=new Vector<>(10,3);
        v.addElement("Hashim");
        v.addElement(143);
        v.addElement("Rani");
        System.out.println(v.capacity());
        for(int i=1; i<=10; i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        Enumeration<Object> e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(v);
    }
}
