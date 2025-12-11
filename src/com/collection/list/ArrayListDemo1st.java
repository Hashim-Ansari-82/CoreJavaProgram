package com.collection.list;
import java.util.*;

public class ArrayListDemo1st {
    public static void main(String[] args) {
         ArrayList<Object> al=new ArrayList<Object>();

         al.add("Hashim");
         al.add(143);
         al.add(10.3);
         al.add('N');
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add('R');
        al.add(4,"Ansari");
        System.out.println(al);
        Iterator<Object> itr=al.iterator();
      while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
