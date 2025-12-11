package com.serialization;
import java.io.*;

class Account1st implements Serializable{

    String username="Hashim Ansari";
    transient String password="Rani";

    private void writeObject(ObjectOutputStream oos)throws Exception{
        oos.defaultWriteObject();
        String epassword="123"+password;
        oos.writeObject(epassword);
    }
    private void readObject(ObjectInputStream ois)throws Exception{
        ois.defaultReadObject();
        String epassword=(String)ois.readObject();
        password=epassword.substring(3);
    }
}
class CustomizeSerialization1st {

    public static void main(String[] args)throws Exception {
        Account1st a = new Account1st();
        System.out.println("Username --> " + a.username + " ....  Password ---> " + a.password);

        FileOutputStream fos = new FileOutputStream("xyz.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        FileInputStream fis = new FileInputStream("xyz.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account1st a1 = (Account1st) ois.readObject();

        System.out.println("Username --> " + a1.username + " ....  Password ---> " + a1.password);
    }
}
