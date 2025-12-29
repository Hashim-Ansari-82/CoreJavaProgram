class DuplicatElement{
    public static void main(String[] args) {
        int[] a={2,34,56,5,7,8,9,6,53,3,4,5,4,4,5,4,32,3,4,5,66};
        int count=0;
        for (int j = 0; j < a.length; j++) {
           for (int i = j+1; i < a.length; i++) {
               if(a[i]==a[j]){
                  System.out.println("Duplicate Element : "+a[i]);
                  count++;
               }
           }
        }
        System.out.println("How Many times duplicate element present in Array : "+count);
    }
}