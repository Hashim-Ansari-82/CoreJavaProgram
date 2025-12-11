package ArrayDemo;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7,8,5,7,5,3,5,3,8,9};
        for (int i = 0; i < a.length; i++) {
            boolean ifContinue=false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    ifContinue=true;
                    break;
                }
            }
            if (!ifContinue) {
                System.out.print(a[i]+",");
            }

        }
    }
}
