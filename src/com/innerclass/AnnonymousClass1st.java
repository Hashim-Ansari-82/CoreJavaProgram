package com.innerclass;

class PopCorn {

    public void taste() {
        System.out.println("Salty");
    }
}
class AnnonymousClass1st{

    public static void main(String[] args) {

        PopCorn pc1=new PopCorn(){
            public void taste(){
                System.out.println("Spicy");
            }
        };
        pc1.taste();

        PopCorn pc2=new PopCorn();
         pc2.taste();

        PopCorn pc3=new PopCorn(){
            public void taste(){
                System.out.println("Sweet");
            }
        };
          pc3.taste();

        System.out.println(pc2.getClass().getName());
        System.out.println(pc1.getClass().getName());
        System.out.println(pc3.getClass().getName());
    }
}