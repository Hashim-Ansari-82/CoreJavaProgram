package com.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Object> h=new HashSet<>();
        h.add(143);
        h.add('R');
        h.add("H");
        h.add(null);
        System.out.println("Size : "+h.size());
        System.out.println(h);
    }
}
