package com.numericpattern;

public class NumericPattern2nd {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                count+=1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
