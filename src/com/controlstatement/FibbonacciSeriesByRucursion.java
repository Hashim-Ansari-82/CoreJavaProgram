package com.controlstatement;

public class FibbonacciSeriesByRucursion {
    static int no1=0,no2=1,no3;
     static void febRecurion(int no4){
      if(no4>=1){
          no3=no1+no2;
          System.out.print(","+no3);
          no1=no2;
          no2=no3;
          febRecurion(no4-1);
      }
    }
    public static void main(String[] args) {
        System.out.print(no1+","+no2);
       // FibbonacciSeriesByRucursion fs=new FibbonacciSeriesByRucursion();
       febRecurion(5);
    }
}
