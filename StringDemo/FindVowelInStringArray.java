package StringDemo;

class FindVowelInStringArray{
    public static void main(String[] args){
        String[] str={"Hashim","Ansari","Rani","Apple","Java"};
      int count=0,vowel=0,consonant=0;
        for(String word:str){
           for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
                 if("aeiouAEIOU".indexOf(ch) != -1){
                System.out.println(ch+" is Vowel in "+word);
                count++;
                vowel++;
                }
                else
                    consonant++;
                    count++;
            }
        }
        System.out.println("Total Alphabet : "+count);
        System.out.println("Total vowel : "+vowel);
        System.out.println("Total Consonant : "+consonant);
    }
}