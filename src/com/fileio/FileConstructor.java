package com.fileio;
import java.io.File;
import java.io.IOException;

public class FileConstructor {

    public static void main(String[] args) throws IOException{
        File f=new File("HashimAnsari.txt");
        f.mkdir();
        File f1=new File("C://HashimAnsari","Ansari.txt");
       // File f1=new File(f,"HashimAnsari");
        f1.createNewFile();
        System.out.println(f1.exists());
      //  f1.delete();
        System.out.println(f1.exists());
    }
}
