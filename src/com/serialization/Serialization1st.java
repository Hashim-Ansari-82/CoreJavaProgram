package com.serialization;

import java.io.*;

class Customer implements Serializable {

    String name = "Hashim Ansari";
    transient int id = 867161;
}

public class Serialization1st {

    public static void main(String[] args) throws Exception {

        Customer c=new Customer();
        System.out.println("<--------------- Serialization ----------------->");
        FileOutputStream fos=new FileOutputStream("Hashim.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        System.out.println(c.name+" ----- "+c.id);

        System.out.println("<--------------- Deserialization ----------------->");
        FileInputStream fis=new FileInputStream("Hashim.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Customer c1=(Customer)ois.readObject();
        System.out.println(c1.name+" ----- "+c1.id);

    }
}
