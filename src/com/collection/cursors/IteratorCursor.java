package com.collection.cursors;

import java.util.*;

public class IteratorCursor {
    public static void main(String[] args) {

        ArrayList<Object> al=new ArrayList<>();
        for(int i=1; i<=10; i++){
            al.add(i);
        }
        System.out.println(al);
        Iterator<Object> itr=al.iterator();
        while(itr.hasNext()){
            Integer I=(Integer)itr.next();
            if(I%2==0){
                System.out.println(I);
            }
            else{
                itr.remove();
            }
        }
        System.out.println(al);
    }
}
