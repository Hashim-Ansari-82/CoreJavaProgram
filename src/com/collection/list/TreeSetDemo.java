package com.collection.list;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Object> ts=new TreeSet<>();

         ts.add("H");
         ts.add("B");
         ts.add("A");
         ts.add("a");
         ts.add("Z");
      //   ts.add(10);
      //   ts.add(null);
        System.out.println(ts);
    }
}
