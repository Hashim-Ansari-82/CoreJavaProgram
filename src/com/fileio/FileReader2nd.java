package com.fileio;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class FileReader2nd {

    public static void main(String[] args) throws IOException {
        File f=new File("HashimAnsari.txt");
        char[] ch=new char[(int)f.length()];
        FileReader fr=new FileReader(f);
        fr.read(ch);
        for(char ch1:ch){
            System.out.print(ch1);
        }
          fr.close();
    }
}
