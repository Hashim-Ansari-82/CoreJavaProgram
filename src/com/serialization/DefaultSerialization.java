package com.serialization;
import java.io.*;

class Account3rd implements Serializable{

    String username="Hashim Ansari";
    transient String password="Rani";

}
class DefaultSerialization{

    public static void main(String[] args)throws Exception{
        Account3rd a=new Account3rd();
        System.out.println("Username --> "+a.username+" ....  Password ---> "+a.password);

        FileOutputStream fos=new FileOutputStream("xyz.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);

        FileInputStream fis=new FileInputStream("xyz.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account3rd a1=(Account3rd)ois.readObject();

        System.out.println("Username --> "+a1.username+" ....  Password ---> "+a1.password);
    }
}