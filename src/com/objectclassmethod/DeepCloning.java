package com.objectclassmethod;

class Rabbit{
    int i;
    Rabbit(int i){
        this.i=i;
    }
}
class Parrot implements Cloneable{

    Rabbit r;
    int j;
    Parrot(Rabbit r, int j){
        this.j=j;
        this.r=r;
    }
    public Object clone() throws CloneNotSupportedException{
        Rabbit r1=new Rabbit(r.i);
        Parrot p=new Parrot(r1,j);
        return p;
    }
}
public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rabbit r=new Rabbit(10);
        Parrot p1=new Parrot(r,20);
        System.out.println(p1.j+"......."+p1.r.i);
        Parrot p2=(Parrot)p1.clone();
        p2.r.i=777;
        p2.j=888;
        System.out.println(p1.j+"......."+p1.r.i);
    }
}
