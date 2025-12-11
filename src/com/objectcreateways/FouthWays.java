package com.objectcreateways;

public class FouthWays implements Cloneable {

    int x=10;

    public Object clone() throws CloneNotSupportedException{
        System.out.println("Using Clone Method");
        return super.clone();
    }

    public static void main(String[] args) throws Exception {

      FouthWays fw=new FouthWays();
      FouthWays fw1=(FouthWays) fw.clone();

        System.out.println(fw1.x);
        System.out.println(fw.x);
    }
}
