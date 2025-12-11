package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger2nd {
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("abc.txt");
        BufferedReader br=new BufferedReader(new FileReader("Hashim.txt"));
        BufferedReader br1=new BufferedReader(new FileReader("HashimAnsari.txt"));

        String line=br.readLine();
        String line1=br1.readLine();

        while((line != null)||(line1 !=null)){

            if(line !=null) {
                pw.println(line);
                line = br.readLine();
            }
            if(line1 !=null) {
                pw.println(line1);
                line1 = br1.readLine();
            }
        }
        pw.flush();
        br1.close();
        br.close();
        pw.close();
    }
}
