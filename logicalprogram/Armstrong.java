class Armstrong{
   public static void main(String[] args){
       int a=153;
	   int b=a;
	   int sum=0;
	   while(a>0){
		   int digit=a%10; // 3,5,1
		   sum=sum+(digit*digit*digit);  // 27,152,153
		   a=a/10;  //15,1
	   }
	   if(sum==b){
		  System.out.println(sum+" is armstrong Number");
	   }
	   else 
	   System.out.println(sum+" Not a armstrong Number");
   }
}