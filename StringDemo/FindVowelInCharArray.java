package StringDemo;

class FindVowelInCharArray{
    public static void main(String[] args) {
        char[] a={'R','w','t','r','i','y','i','d','u','a','A'};
        int count=0, vowel=0,consonant=0;
        for(int i:a){
            if("aioeuAEIOU".indexOf(i) !=-1){
                // char c=(char)i;
                // System.out.print(c+" ");
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
        System.out.println("Total consonat : "+consonant);
    }
}