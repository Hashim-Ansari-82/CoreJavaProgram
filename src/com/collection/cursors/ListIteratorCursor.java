package com.collection.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCursor {
    public static void main(String[] args) {

        ArrayList<Object> al=new ArrayList<>();
        al.add("Hashim");
        al.add("Qasim");
        al.add("Salim");
        al.add("Asim");
        al.add("Tahir");
        al.add("Suhaib");
        System.err.println("<===== Forward Traverse =====>\n");
        ListIterator<Object> lt=al.listIterator();
        while (lt.hasNext()){
            Object element=lt.next();
            System.out.println("Element : "+element+" | Next Element : "+lt.nextIndex()+" | Previous Element : "+lt.previousIndex());

            if(element.equals("Hashim")){
                lt.add(143);
            }
            else if(element.equals("Qasim")){
                lt.set("Rani");
            }
            else if(element.equals("Tahir")){
                lt.remove();
            }
        }
        System.out.println("\n<===== After Forward Traverse List ====>\n"+"\n"+al);

        System.out.println("\n <======= Backword Traverse ======>\n");
        while (lt.hasPrevious()) {
            Object element = lt.previous();
            System.out.println("Element : " + element+" | Next Element : " +lt.nextIndex()+" | Previous Element : " +lt.previousIndex());
        }

        System.out.println("\n<==== After Backword Traverse List ===>\n"+"\n"+al);
    }
}
