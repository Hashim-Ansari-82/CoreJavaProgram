package com.fileio;

import java.io.File;
import java.io.IOException;


public class FileDemo1st {
    public static void main(String[] args) throws IOException {
        File f=new File("HashimAnsari.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
    }
}
