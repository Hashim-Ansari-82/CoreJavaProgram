package arrayprogram;

class IterateArrayElement{
  public static void main(String[] args){
   int []a={1000,57,48,9,5};
    System.out.println("For Loop");
   for(int i=0; i<a.length; i++){
      System.out.print(a[i]+",");
   }
   System.out.println("\n");
     System.out.println("For each Loop");
   for(int j:a){
     System.out.print(j+",");
   }
   System.out.println("\n");
    System.out.println("while loop");
	int k=0;
	while(k<a.length){
	 System.out.print(a[k]+",");
	 k++;
	}
	System.out.println("\n");
	System.out.println("do While loop");
	int l=0;
	do{
	  System.out.print(a[l]+",");
	  l++;
	}
	while(l<a.length);
  }
  
}