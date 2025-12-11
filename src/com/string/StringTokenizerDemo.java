package com.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {

        StringTokenizer st=new StringTokenizer("Hashim-Ansari","-");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
