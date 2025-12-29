class EvenOrOddCount{
    public static void main(String[] args){
       int[] a={1,2,3,4,5,6,7,8,9,9,8,7,6,5,5,4,4,3,2,1,1};
       int even=0,odd=0;
       for(int i=0; i<a.length; i++){
        if(a[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
       }
       System.out.println("Even Number : "+even+"\t Odd Number : "+odd);
    }
}