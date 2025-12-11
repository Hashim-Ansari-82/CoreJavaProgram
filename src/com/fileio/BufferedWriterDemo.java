package com.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("HashimAnsari.txt");
        BufferedWriter bw=new BufferedWriter(fw);
         bw.write(82);
         char[] ch= {'a','n','i'};
         bw.write(ch);
         bw.newLine();
         bw.write("Hashim");
         bw.newLine();
         bw.write("Ansari");
         bw.flush();
         bw.close();
    }
}
