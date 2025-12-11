package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1; i<=10; i++){
            al.add(i);
        }
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
