class ShiftZeroLast{
    public static void main(String[] args) {
        int[] a={0,4,6,0,4,6,0,7};
        int target=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                a[target]=a[i];
                target++;
            }
        }
        while (target<a.length) {
            a[target]=0;
            target++;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}