package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidMobileNo {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(args[0]);

        if(m.find() && m.group().equals(args[0])){
            System.out.println(args[0]+" Valid mobile Number");
        }
        else {
            System.out.println(args[0]+" invalid Valid mobile Number");
        }
    }
}
