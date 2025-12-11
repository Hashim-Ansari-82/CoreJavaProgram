package com.string;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {
    public static void main(String[] args){

        int count=0;
        Pattern p=Pattern.compile("[a-zA-Z0-9_$.]+[.](class|java|txt|ser)");
        File f=new File("C:\\Hashim Ansari\\CoreJava");
        String[] a=f.list();
        for(String a1:a){
            Matcher m=p.matcher(a1);
            if(m.find() && m.group().equals(a1)){
                System.out.println(a1);
                count++;
            }
        }
        System.out.println(count);
    }
}
