package com.objectclassmethod;

                              /*With override hashCode method*/

public class HashCodeMethod2 {

       int i;

    HashCodeMethod2(int i){
           this.i=i;
       }
       public int hashCode(){
           return i;
       }

    public static void main(String[] args) {

        HashCodeMethod2 h=new HashCodeMethod2(10);
        HashCodeMethod2 h1=new HashCodeMethod2(101);

        System.out.println(h);
        System.out.println(h1);
    }
}
