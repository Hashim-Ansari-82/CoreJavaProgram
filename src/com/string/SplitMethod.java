package com.string;
import java.util.regex.*;

public class SplitMethod {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("\\s");
        String[] s=p.split("Hashim Ansari Koilsa");
        for(String s1:s){
            System.out.println(s1);
        }
    }
}
