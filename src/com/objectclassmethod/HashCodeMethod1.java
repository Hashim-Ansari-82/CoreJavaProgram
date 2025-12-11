package com.objectclassmethod;

                         /*Without override hashCode method*/

 class HashCodeMethod1 {

    int i;

    HashCodeMethod1(int i){
        this.i=i;
    }

    public static void main(String[] args) {

        HashCodeMethod1 h=new HashCodeMethod1(10);
        HashCodeMethod1 h1=new HashCodeMethod1(101);

        System.out.println(h);
        System.out.println(h1);
    }
}
