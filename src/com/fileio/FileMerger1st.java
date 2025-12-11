package com.fileio;
import java.io.*;

public class FileMerger1st {
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("Ansari.txt");
        BufferedReader br=new BufferedReader(new FileReader("Hashim.txt"));
        String line=br.readLine();
        while(line != null){

            pw.println(line);
            line=br.readLine();
        }
        br=new BufferedReader(new FileReader("HashimAnsari.txt"));
         line=br.readLine();
        while(line != null){

           pw.println(line);
            line=br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
    }
}
