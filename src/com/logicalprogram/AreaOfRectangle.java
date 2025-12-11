package LogicalProgram;

import java.util.Scanner;

public class AreaOfRectangle {
	 public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
		  System.out.println("Enter length");
		  int length=sc.nextInt();
		  System.out.println("Enter width");
		  int width=sc.nextInt();
		  int area=length*width;
		  System.out.println("Area of Circle is = "+area); 
	  sc.close();
	}
}
