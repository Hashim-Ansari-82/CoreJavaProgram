package LogicalProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Year ");
	      
	    int a=sc.nextInt();
	    if(a%4==0) 
	    {
	    	if(a%100==0)
	    	{
	    		if(a%400==0) 
	    		{
	    			System.out.println(a+" Leap Year");
	    		}
	    		else 
	    		{
	    			System.out.println(a+" Not A leap Year");
	    		}
	    	}else
	    	{
	    	System.out.println(a+" Leap Year");
	    	}
	    }
	    else
	    {
	    	System.out.println(a+" Not a leap Year");
	    	sc.close();
	    }
	}
}
