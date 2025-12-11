package com.controlstatement;

import java.util.Scanner;

public class FactorialByRecursion {
      static  int fact=1;
    void calFact(int no) {
        if (no > 1) {
            fact = fact * no;
            calFact(no - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int no=sc.nextInt();
        FactorialByRecursion fb=new FactorialByRecursion();
        fb.calFact(no);
        System.out.println("Factorial no "+no+" is = "+fact);
    }

    public static class FactorialNumber {
        public static void main(String[] args) {
            Scanner  sc=new Scanner(System.in);
            System.out.println("Enter a Number ");
            int no=sc.nextInt();
            int fact=1;
            for (int i=1;i<=5;i++){
                fact =fact*i;
            }
            System.out.println("Factoral No "+no+" is = "+fact);
            sc.close();
        }
    }

}
