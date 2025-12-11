package ArrayDemo;

public class FindEvenNoInArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 4, 3, 5, 6,7,4, 8, 9, 7, 5, 3, 1,};
        for (int i = 0; i <a.length ; i++) {
            if (a[i]% 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println(a[0]);
    }
}
