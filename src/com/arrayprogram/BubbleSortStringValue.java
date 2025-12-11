package ArrayDemo;

public class BubbleSortStringValue {

    public static void main(String[] args) {

        String[] s={"Hashim","Ansari","Koilsa","Sant","Kabir ","Nagar"};
        String temp;
        for(int i=0; i<s.length; i++){
            int flag=0;
            for(int j=0; j<s.length-1-i; j++){
                if(s[j].compareTo(s[j+1])>=0){

                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(String i:s){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
