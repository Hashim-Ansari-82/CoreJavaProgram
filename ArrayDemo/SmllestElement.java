class SmllestElement{
    public static void main(String[] args){
        int[] a={4,9,8,7,2,1,3,4,5,5};
        int min=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}