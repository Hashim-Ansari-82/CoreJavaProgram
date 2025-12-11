package com.logicalprogram;

public class StringBreak1 {

	public static void main(String[] args) {
		
		        String str = "Hashim ansari";
		        	
		        String[] parts = str.split("(?<=a)|(?=a)");

		        for (String s : parts) {
		            System.out.print(s+",");
        }
	}
}