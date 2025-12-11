package com.innerclass;

class OuterClass3rd{

    int x=20;
    static int y=10;
    class InnerClass3rd {

        int x=200;
        void show(){

            int x=2000;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(OuterClass3rd.this.x);
            System.out.println(y);


        }
   }
    public static void main(String[] args) {

        new OuterClass3rd().new InnerClass3rd().show();
    }
}
