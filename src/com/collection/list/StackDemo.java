package com.collection.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Object>  s=new Stack<>();
        s.push("Hashim");
        s.push("Qasim");
        s.push("Salim");
        System.out.println(s.search("Hashim"));
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
    }
}
