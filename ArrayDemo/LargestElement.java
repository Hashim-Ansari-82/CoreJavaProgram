class LargestElement{
    public static void main(String[] args){
         int[] a={2,4,5,6,7,8,4,3,2};
         int max=a[0];
         for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
         }
         System.out.print(max);
    }
}