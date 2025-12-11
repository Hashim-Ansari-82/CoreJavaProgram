package ArrayDemo;

public class ArrayFindDuplicate{
    public static void main(String[] args) {
        int[] a={2,3,4,5,3,2,4,5,1,8,7,6,6,7,};
        for (int i=0; i<a.length; i++){
            for(int j=i+1;j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate Element = "+a[i]);
                }
            }
        }
    }
}
