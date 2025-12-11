package ArrayDemo;

public class SkipElement {
        public static void main(String[] args) {
            int[] a={1,2,4,5,6,6,7,7};
            int sum=0;
            for(int i=0; i<a.length; i++){
                if(i%2==0){
                    continue;
                }
                else{
                    sum+=a[i];
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println("\nSum : "+sum);
        }

}
