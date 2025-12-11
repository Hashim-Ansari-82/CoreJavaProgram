package ArrayDemo;

public class SelectionSortIntValue {
    public static void main(String[] args) {

        int[] a={86,4,3,355,7,8,3,3,2,33,33,4,56};

        int min,temp=0;
        for(int i=0; i<a.length; i++){
            min=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
           a[i]=a[min];
            a[min]=temp;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
