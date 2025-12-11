package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1st {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("HashimAnsari.txt");
        fw.write(82);
        fw.write("ani\nHashim Ansari \n");
        char[] ch={'H','a','s','h','i','m'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}
