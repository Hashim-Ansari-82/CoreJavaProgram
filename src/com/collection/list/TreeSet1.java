package com.collection.list;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Object> t=new TreeSet<>(new MyComparator3());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("HASHIM");
        System.out.println(t);
    }
}
class MyComparator3 implements Comparator<Object>{
    public int compare(Object o1, Object o2 ){
        String str=o1.toString();
        String str1=o2.toString();
        int i=str.length();
        int i1=str1.length();
        if(i<i1)
            return -1;
        else if (i>i1)
            return +1;
        else
            return str.compareTo(str1);
    }
}
