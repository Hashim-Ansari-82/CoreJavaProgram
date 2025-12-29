class ShiftLastZeroLastIndex{
    public static void main(String[] args) {
        int[] a={4,0,4,0,3,0,7};
        int position=-1;
        for (int i=a.length-1; i>=0; i--) {
            if(a[i] == 0){
                position=i;
                  break;
            }
        }
        if(position != -1 && position!=a.length-1){
            int temp=a[position];
            for (int i =position; i < a.length-1; i++) {
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}