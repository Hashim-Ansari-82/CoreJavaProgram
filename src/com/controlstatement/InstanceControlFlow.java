
package com.controlstatement;

public class InstanceControlFlow {
    int i=10;
    {
        m();
        System.out.println("First Instance Block");
    }
    InstanceControlFlow() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        InstanceControlFlow ic=new InstanceControlFlow();
        ic.m();
        System.out.println("Main Method");
    }
    public void m() {
        System.out.println(j);
    }
    {
        System.out.println("Second Instance Block");
    }
  int j=20;
}
