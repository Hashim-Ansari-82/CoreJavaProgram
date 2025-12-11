package com.string;

import java.io.*;
import java.util.regex.*;

public class MobileNumberExtractor {
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("output.txt");
        Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
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
