package ArrayDemo;

public class Iterate1DArrayElement {

    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70};
        System.out.println("<------- For loop --------> ");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        int i=0;
        System.out.println("\n<------- While loop --------> ");
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        int j=0;
        System.out.println("\n<------- Do While loop--------> ");
        do{
            System.out.print(a[j]+" ");
            j++;
        }
        while(j<a.length);
        System.out.println("\n<------- For each loop --------> ");
        for(int k:a){
            System.out.print(k+" ");
        }

    }

}
