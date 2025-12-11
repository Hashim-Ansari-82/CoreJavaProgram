package com.innerclass;

             /* Static Area Access inner Class */

class OuterClass1st {

    class InnerClass1st {
        public void m() {
            System.out.println("Inner class method ");
        }
    }

    public void m1() {
        System.out.println("Outer class method");
        InnerClass1st i = new InnerClass1st();
        i.m();
    }
}
class ThirdClass{
    public static void main(String[] args) {

       OuterClass1st o=new  OuterClass1st();
       OuterClass1st.InnerClass1st i=o.new InnerClass1st();
       // OuterClass1st.InnerClass1st i=new OuterClass1st().new InnerClass1st();
       // Outer.InnerClass1st i=new Outer().new InnerClass1st();
       //   i.m();
      i.m();
    }
}
