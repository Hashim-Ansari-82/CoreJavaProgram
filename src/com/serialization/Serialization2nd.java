package com.serialization;
import java.io.*;

class Dog implements Serializable{
    Cat c=new Cat();
}
class Cat implements Serializable {
    Rat r=new Rat();
}
class Rat implements Serializable{
    int i=10;
}
class Serialization2nd{
    public static void main(String[] args)throws Exception{
        Dog d=new Dog();
        FileOutputStream fos=new FileOutputStream("Hashim.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream fis=new FileInputStream("Hashim.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();

        System.out.println(d1.c.r.i);
    }
} 