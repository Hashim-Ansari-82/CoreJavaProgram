import java.util.*;

class ReverseArray{
    public static void main(String[] args){
      int[] a={3,4,52,3,4,7,5,75,8,6,5};
      for(int i=a.length-1; i>0; i--){
        Arrays.sort(a);
        System.out.print(a[i]+" ");
      }
    }
}