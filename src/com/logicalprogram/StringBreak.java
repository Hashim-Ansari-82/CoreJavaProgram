package com.logicalprogram;

import java.util.StringTokenizer;

public class StringBreak {

	public static void main(String[] args) {
		
		String str="mumbai sakinaka";
		
		StringTokenizer st=new StringTokenizer(str,"a",true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
