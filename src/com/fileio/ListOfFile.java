package com.fileio;
import java.io.File;

                           /*I Want File And Directory*/
/*public class ListOfFile {
    public static void main(String[] args) {

        int count=0;
        File f=new File("D://JavaProgram");
        String[] s= f.list();
        for(String s1:s){
            count++;
            System.out.println(s1);
        }
        System.out.println("Total File Number : "+count);
    }
}*/

                          /*I Want Only file */

public class ListOfFile{
    public static void main(String[] args) {
        int count=0;
        File f=new File("D://");
        String[] s=f.list();
        for(String s1:s){
            File f1=new File(f,s1);
            if(f1.isFile()){
                count++;
                System.out.println(f1);
            }
        }
        System.out.println("Total Number of File : "+count);
    }
}
                            /*I Want Only Directory */
/*

public class ListOfFile{
    public static void main(String[] args) {
        int count=0;
        File f=new File("D://");
        String[] s=f.list();
        for(String s1:s){
            File f1=new File(f,s1);
            if(f1.isDirectory()){
                count++;
                System.out.println(f1);
            }
        }
        System.out.println("Total Number of File : "+count);
    }
}*/
