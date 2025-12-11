package com.objectcreateways;

public class SecondWays {

         static {
              System.out.println("Static block");
         }
         {
             System.out.println("Initializer Block");
         }
        SecondWays(){
             System.out.println("Constructor");
        }
        void show(){
             System.out.println("Using new instance()");
        }
    public static void main(String[] args) throws Exception{

            SecondWays sd=(SecondWays) Class.forName("ObjectCreate5Ways.SecondWays").newInstance();
            sd.show();
    }
}
