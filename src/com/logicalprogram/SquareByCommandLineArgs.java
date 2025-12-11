package com.logicalprogram;

class SquareByCommandLineArgs{
    public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		System.out.println("The Square of "+n+" is "+(n*n));
	}
}