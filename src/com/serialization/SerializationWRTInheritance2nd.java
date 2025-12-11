package com.serialization;
import java.io.*;

class Anima2nd {
    int i=10;
    Anima2nd(){
        System.out.println("Animal constructor");
    }
}
class Dog2nd extends Anima2nd implements Serializable{
    int j=20;
    Dog2nd(){
        System.out.println("Dog Constructor");
    }
} 
class SerializationWRTInheritance2nd {
    public static void main(String[] args) throws Exception{

        Dog2nd d=new Dog2nd();
        d.i=333;
        d.j=444;
        System.out.println(d.i+"....."+d.j);
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog2nd d1=(Dog2nd)ois.readObject();

        System.out.println(d1.i+"....."+d1.j);

    }
}