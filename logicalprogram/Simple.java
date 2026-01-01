import java.util.Arrays;

public class Simple {  
    public static void main(String[] args) {

        int[] arr = {25,4,15,5,9,30,13,7,19};

        Arrays.sort(arr);

        for (int i = 1; i < arr[0]; i++) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                System.out.print(j + " ");
            }
        }
    }
}



