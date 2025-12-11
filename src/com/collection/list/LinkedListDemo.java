package com.collection.list;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Object> ll=new LinkedList<>();
        ll.add("Hashim ");
        ll.add(143);
        ll.add("Hashim");
        ll.add('R');
        ll.add(10.5);
        ll.add(null);
        ll.add("Hashim ");
        ll.set(0,"Rani");
        ll.add(0,"Hashim");
        ll.remove();
        ll.removeLast();
        System.out.println(ll);
        ListIterator<Object> l=ll.listIterator(ll.size());
        while(l.hasPrevious()){
            System.out.println(l.previous());
        }
    }
}
