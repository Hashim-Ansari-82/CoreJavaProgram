package com.fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1st {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("HashimAnsari.txt");
        int i=fr.read();
        while (i>-1){
            System.out.print((char)i);
            i=fr.read();
        }
        fr.close();
    }
}
