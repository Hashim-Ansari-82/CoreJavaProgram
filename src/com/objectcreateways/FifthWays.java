package com.objectcreateways;

import java.io.*;

class Dog implements Serializable{
    int x=10;
}

public class FifthWays {
    public static void main(String[] args) throws  Exception{

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Dog d=(Dog) ois.readObject();
        System.out.println(d.x);
    }
}
