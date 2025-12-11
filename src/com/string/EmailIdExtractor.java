package com.string;

import java.io.*;
import java.util.regex.*;

public class EmailIdExtractor {
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("output.txt");
        Pattern p= Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        String line=br.readLine();
        while(line != null){
            Matcher m= p.matcher(line);
            while (m.find()){
               // System.out.println(m.group());
                pw.println(m.group());
            }
            line=br.readLine();
        }
        pw.flush();
        System.out.println("check output txt file");
    }
}
