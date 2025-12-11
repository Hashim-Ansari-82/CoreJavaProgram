package com.fileio;

import java.io.File;
import java.io.IOException;


public class FileDemo2nd {
    public static void main(String[] args) throws IOException {
        File f=new File("Rani.text");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
