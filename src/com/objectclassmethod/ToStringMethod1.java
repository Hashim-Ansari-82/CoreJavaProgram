package com.objectclassmethod;

                             /*Without override toString Method*/


class ToStringMethod1 {

   int i;

    ToStringMethod1(int i){
       this.i=i;
   }

   public static void main(String[] args) {

       ToStringMethod1 t=new ToStringMethod1(10);
       ToStringMethod1 t1=new ToStringMethod1(100);

       System.out.println(t);
       System.out.println(t1);
   }
}
