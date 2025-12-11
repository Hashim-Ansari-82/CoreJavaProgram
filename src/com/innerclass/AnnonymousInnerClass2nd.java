package com.innerclass;

                 /*Annonymous Class through extends Thread Class*/

class AnnonymousInnerClass2nd extends Thread
{
    public static void main(String[] args)
    {
        AnnonymousInnerClass2nd a=new AnnonymousInnerClass2nd()
        {
            public void run()
            {
                for(int i=1; i<=5; i++)
                {
                    for(int j=4; j>=i; j--)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1; k<=i; k++)
                    {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
            }
        };
        a.start();
    }
}