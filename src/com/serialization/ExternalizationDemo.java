package com.serialization;

import java.io.*;

 class ExternalizationDemo implements Externalizable {
    String name;
    int i,j;
    public ExternalizationDemo(String name, int i, int j){
        this.name=name;
        this.i=i;
        this.j=j;
    }
    public ExternalizationDemo(){
         System.out.println("public no-arg Constructor");
     }
    public void writeExternal(ObjectOutput oo) throws IOException {
        oo.writeObject(name);
        oo.writeInt(i);
    }
    public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
        name=(String)oi.readObject();
        i=oi.readInt();
    }

    public static void main(String[] args) throws Exception{

        ExternalizationDemo e=new ExternalizationDemo("Hashim Ansari",10,20);
        System.out.println(e.name+" .... "+e.i+" .... "+e.j);
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e);
        
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizationDemo e1=(ExternalizationDemo)ois.readObject();
        System.out.println(e1.name+" .... "+e1.i+" .... "+e1.j);
    }
}
