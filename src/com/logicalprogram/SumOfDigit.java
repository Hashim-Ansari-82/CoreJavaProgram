package com.logicalprogram;

class SumOfDigit{
    public static void main(String args[]){
    int a= 8;
    int sum = 0;
    while(a>0)
        sum+= a%10;
        a = a/10;
        System.out.println(sum);

    }
}