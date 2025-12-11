package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidEmailId2nd {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("[a-zA-Z0-9_.]*@gamil.com");
        Matcher m=p.matcher(args[0]);

        if(m.find() && m.group().equals(args[0])){
            System.out.println(args[0]+" Valid gmail id");
        }
        else {
            System.out.println(args[0]+" invalid Valid gmail id");
        }
    }
}
