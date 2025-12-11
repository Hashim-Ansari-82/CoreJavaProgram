package com.logicalprogram;

public class Var_arg_Demo {
    static void sum(int... x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
       System.out.print("Number of Arguments = "+x.length);
        System.out.println("  Sum = "+sum);
    }
    public static void main(String[] args) {
        sum();
        sum(10,20);
        sum(10,20,30 );
        sum(10,20,30,40);
        sum(10,20,30,40,50);
        sum(10,20,30,40,50,60);
    }
}