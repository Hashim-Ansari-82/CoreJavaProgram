package com.logicalprogram;

public class Prime_No {

	public static void main(String[] args) {
		int a=100;
		
		for(int i=1; i<=a; i++)
		{
			int count=0;
			for(int j=2; j<=i-1; j++)
			{
				if(i%j==0) 
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				System.out.print(i+",");
			}
		}
	}

}
