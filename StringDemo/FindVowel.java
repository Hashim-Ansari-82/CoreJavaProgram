package StringDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FindVowel{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Alphabt");
        String alphabet=br.readLine();
         int vowel=0,consonant=0,count=0;;
        for(int i=0; i<alphabet.length(); i++){
            char c=alphabet.charAt(i);
        
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'|| c=='e' || c=='e' || c=='i' || c=='o' || c=='u' ){
            vowel++;
            count++;
            }
            else{
                consonant++;
                count++;
            }
        }
        System.out.println("Total Alphabet : "+count);
        System.out.println("Total Vowel : "+vowel);
        System.out.println("Total Consonant : "+consonant);
    }
}