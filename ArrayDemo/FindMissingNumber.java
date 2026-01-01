import java.util.Arrays;

public class FindMissingNumber {
   public static void main(String[] args) {
      
      int[] a={20,5,7,25,9,10,23,13,15,22,17};

      Arrays.sort(a);
      for (int i = 1; i < a[0]; i++) {
        System.out.print(i+" ");
      }
      for(int i=0; i<a.length-1; i++){
          for(int j=a[i]+1; j<a[i+1];j++){
            System.out.print(j+" ");
          }
      }
   }
}
