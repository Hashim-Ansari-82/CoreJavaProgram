package com.serialization;
import java.io.*;

class Animal implements Serializable {
    int i=10;
}
class Dog1st extends Animal {
   int j=20;
} 
class SerializationWRTInheritance1st {
    public static void main(String[] args) throws Exception{

        Dog1st d=new Dog1st();
        System.out.println(d.i+"....."+d.j);
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog1st d1=(Dog1st)ois.readObject();

        System.out.println(d1.i+"....."+d1.j);

    }
}