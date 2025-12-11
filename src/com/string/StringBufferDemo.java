package com.string;


public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        sb.append(" Rani Hashim Ansari");
        sb.append(" Rani Hashim Ansari");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
