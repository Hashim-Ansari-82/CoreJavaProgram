class Shift1stZeroLastIndex{
    public static void main(String[] args) {
        int[] a={3,4,0,5,0,4,8,0,9,6,9};
        int position=-1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                position=i;
                break;
            }
        }
        if(position !=-1){
           int temp=a[position];
           for (int i = position; i < a.length-1; i++) {
            a[i]=a[i+1];
           }
            a[a.length-1]=temp;
        }
        for (int i : a) {
        System.out.print(i+" ");
        }
    }
}