class IndexSwaping{
    public static void main(String[] args) {
        int[] a={34,5,66,7,8,6,8};
        System.out.println("<---- Before Swaping ---->");
        for (int i : a) {
           System.out.print(i+" ");
        }
        for (int i = 0; i < a.length-1; i+=2) {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        System.out.println("\n<--- After Swaping --->");
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}