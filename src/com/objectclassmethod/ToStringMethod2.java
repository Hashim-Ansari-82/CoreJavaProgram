package com.objectclassmethod;
                             /* With override toString Method */

 class ToStringMethod2 {

    int i;

     ToStringMethod2(int i){
        this.i=i;
    }
    public String toString(){
        return i+"";
    }
    public static void main(String[] args) {

        ToStringMethod2 t=new ToStringMethod2(10);
        ToStringMethod2 t1=new ToStringMethod2(100);

        System.out.println(t);
        System.out.println(t1);
    }
}
