package com.logicalprogram;

import java.util.Scanner;

class LossAndProfit{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter cost Price");
      int costprice=sc.nextInt();
      System.out.println("Enter Selling Price");
      int sellingprice=sc.nextInt();
      if(sellingprice>costprice){
	   System.out.println("Profit Rs = "+(sellingprice-costprice));
	   }
	   else if(sellingprice==costprice){
	    System.out.println("No Loss or Profit Rs = "+0);
	   }
	   else{
	    System.out.println("Loss Rs = "+(costprice-sellingprice));
	    sc.close();
	   }
    }
 }