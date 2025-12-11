package arrayprogram;

class DuplicateElement{
   public static void main(String[] args){
       int[] a={2,3,5,4,9,9,6,5,3,2,4,2,1,6,8,4};
	   for(int i=1; i<a.length; i++){
	     for(int j=i+1; j<a.length; j++){
		   if(a[i]==a[j])
		   {
		     System.out.println("Duplicate Element = "+a[i]);
		   }
		 }
	   }
   }
}