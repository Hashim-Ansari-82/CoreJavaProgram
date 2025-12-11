package arrayprogram;

class EvenNumberInArray{
    public static void main(String[] args){
	   int[] a={2,4,6,2,4,9,8};
	    for(int i=0; i<a.length; i++){
		  if(a[i]%2==0){
		   System.out.println(a[i]);
		  }
		}
	}
}