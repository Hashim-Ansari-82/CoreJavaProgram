class DuplicateElementPrintOneTime{
    public static void main(String[] args){

        int[] a={2,3,4,5,6,7,8,9,8,7,6,6,5,5,4,4,3,3,2,2,1,2,2,2};
         
        for(int i=0; i<a.length; i++){
           boolean ifChecked=false;
           for(int j=0; j<i; j++){
               if(a[i]==a[j]){
                  ifChecked=true;
                  break;
               }
           }
           if(ifChecked){
            continue;
           }
         for(int k=i+1; k<a.length; k++){
            if(a[i]==a[k]){
              System.out.print(a[i]+" ");
              break;
            }
         }
        }
 
    }
}