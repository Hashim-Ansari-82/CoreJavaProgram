class Shift1To9Last{
    public static void main(String[] args) {
        
        int[] a={32,2,3,4,56,1,78,7,88,9,65,44,34,3,3,50,5,5,5};
        int[] temp=new int[a.length];
        int index=0;

        for (int i=0; i<a.length; i++) {
            if(a[i]<1 || a[i]>9){
                temp[index++]=a[i];
            }
        }
         for (int i=0; i<a.length; i++) {
            if(a[i]>=1 && a[i]<=9){
                temp[index++]=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            a[i]=temp[i];
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
