class Shift1To9Last{
    public static void main(String[] args) {
        
        int[] a={32,2,3,4,56,78,7,88,9,65,44,34,3,3,50,5,0,5,5,0};
        int index=0;

        for (int i=0; i<a.length; i++) {
            if(a[i]<0 || a[i]>9){
                a[index]=a[i];
                index++;
            }
        }
         for (int i=0; i<a.length; i++) {
            if(a[i]>=0 && a[i]<=9){
                a[index]=a[i];
                index++;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}