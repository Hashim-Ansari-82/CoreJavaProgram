import java.util.Arrays;

public class Find2ndLargestNumberInArray {
     public static void main(String[] args) {
        int[] a={23,65,87,98,46,22,86};
        Arrays.sort(a);
        for(int i=a.length-2; i>=0; i--){
            if(a[i] != a[a.length-1]){
                System.out.println("Second Largest Number : "+a[i]);
                break;
            }
        
        }
     }
}
