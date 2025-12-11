package ArrayDemo;


public class InsertionSort {
    public static void main(String[] args) {
        int[] a={4,3,7,4,89,3,23};
        int temp,j;
        for(int i=1; i<a.length; i++){
            temp=a[i];
            j=i;
            while (j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j-=1;
            }
            a[j]=temp;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}