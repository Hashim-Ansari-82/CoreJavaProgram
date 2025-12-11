package com.collection.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {

        Vector<Object> v=new Vector<>();
        v.addElement("Hashim");
        v.addElement("Qasim");
        v.addElement("Asim");
        v.addElement("Salim");
        Enumeration<Object> e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
