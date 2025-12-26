import java.io.*;

class Palindrome{
   public static void main(String[] args)throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter a Number");
      int a=Integer.parseInt(br.readLine());
	  int b=a;
	  int rev=0;
	  while(a>0){
	    int rem=a%10;
		rev=rev*10+rem;
		a=a/10;
	  }
	  if(rev==b){
	   System.out.println(rev+" is Palindrome number");
	  }
	  else{
	  System.out.println(rev +" is not a palindrome number");
	  }
   }
}