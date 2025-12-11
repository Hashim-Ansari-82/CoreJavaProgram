package com.collection.list;

import java.util.*;

public class TreeSetDemo3 {
        public static void main(String[] args) {
            TreeSet<StringBuffer> t=new TreeSet<>(new MyComparator2());

            t.add(new StringBuffer("Hasim"));
            t.add(new StringBuffer("Ansari"));
            t.add(new StringBuffer("Koilsa"));
            t.add(new StringBuffer("S K"));
            t.add(new StringBuffer("Nagar"));
            System.out.println(t);
        }
    }
class MyComparator2 implements Comparator<StringBuffer>{
    public int compare(StringBuffer o, StringBuffer o1){
        String s=o.toString();
        String s1=o1.toString();
       // return s.compareTo(s1);
        return -s.compareTo(s1);
       // return s1.compareTo(s);
       // return -s1.compareTo(s);
    }
}