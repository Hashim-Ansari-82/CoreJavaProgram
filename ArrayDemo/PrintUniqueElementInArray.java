class PrintUniqueElementInArray{
    public static void main(String[] args){
        int[] a={2,3,52,2,3,4,5,7,3,4,5,6,7,8,8,9,8,79,7,6,54,4,32,1};
        for(int i=0; i<a.length; i++){
            boolean ifUnique=false;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    ifUnique=true;
                    break;
                }
            }
            if(!ifUnique){
                System.out.print(a[i]+" ");
            }
        }
    }
}