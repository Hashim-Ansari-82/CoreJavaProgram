package StringDemo;

import java.io.*;

class PalidromeString{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any String");
        String str1=br.readLine();
        String rev="";
        for(int i=str1.length()-1; i>=0; i--) {
             rev=rev+str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(rev)){
            System.out.println(rev+" is Palindrome String");
        }
        else
            System.out.println(rev+" not Palindrome String");
    }
}