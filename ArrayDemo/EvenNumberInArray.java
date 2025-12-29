import java.util.*;

class EvenNumberInArray{
   public static void main(String[] args) {
    int[] a={4,5,3,6,8,6,4,23,45};

    for (int i = 0; i < a.length; i++) {
        if(a[i]%2==0){
            Arrays.sort(a);
            System.out.print(a[i]+" ");
        }
    }
   }
}