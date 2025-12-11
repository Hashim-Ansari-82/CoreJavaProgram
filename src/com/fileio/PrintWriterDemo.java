package com.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("Hashim.txt",true);
        PrintWriter pw=new PrintWriter(fw);
        pw.write(78);
        pw.println(143);
        pw.println("Hashim Ansari");
        pw.println('H');
        pw.println(10.5);
        pw.println(false);
        pw.flush();
        pw.close();
    }
}
