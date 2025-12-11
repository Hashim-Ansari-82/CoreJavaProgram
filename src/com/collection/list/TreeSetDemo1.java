package com.collection.list;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new MyComparator());
        ts.add(10);
        ts.add(29);
        ts.add(36);
        ts.add(23);
        ts.add(34);
        ts.add(0);
        System.out.println(ts);
    }
}
class MyComparator implements Comparator<Object>{
    public int compare(Object a, Object b) {
        Integer i = (Integer)a;
        Integer i1 = (Integer)b;
        if (i < i1)
            return +1;
        else if (i > i1)
            return -1;
         else
             return 0;
         }
    }
