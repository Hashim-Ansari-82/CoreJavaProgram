package com.collection.list;

import java.util.*;

public class TreeSetDemo2 {
   public static void main(String[] args) {
	TreeSet<Object> t=new TreeSet<>();
   
       t.add(new StringBuffer("Hasim"));
       t.add(new StringBuffer("Ansari"));
       t.add(new StringBuffer("Koilsa"));
       t.add(new StringBuffer("S K"));
       t.add(new StringBuffer("Nagar")); 
       System.out.println(t);
   }
}