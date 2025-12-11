package com.serialization;
import java.io.*;

class Account2nd implements Serializable{
    String username="Hashim Ansari";
    transient String password="Rani";
    transient int pin=143;
    private void writeObject(ObjectOutputStream oos) throws Exception{
        oos.defaultWriteObject();
        String epassword="143"+password;
        oos.writeObject(epassword);
        int epin=234+pin;
        oos.writeInt(epin);
    }
    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
        String epassword=(String)ois.readObject();
        password=epassword.substring(3);
        int epin=ois.readInt();
        pin=epin-234;
    }
}
public class CustomizeSerialization2nd {
    public static void main (String[] args)throws Exception{

        Account2nd a=new Account2nd();
        System.out.println("Username : "+a.username+" ... Password : "+a.password+" .... Pin : "+a.pin);
        FileOutputStream fos=new FileOutputStream("abc.text");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);

        FileInputStream fis=new FileInputStream("abc.text");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account2nd a1=(Account2nd)ois.readObject();

        System.out.println("Username : "+a1.username+" ... Password : "+a1.password+" .... Pin : "+a1.pin);
    }
}