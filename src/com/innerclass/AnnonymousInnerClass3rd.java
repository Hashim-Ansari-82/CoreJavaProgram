package com.innerclass;

                         /*Annonymous Class through Implements Runnable Interface*/

class AnnonymousInnerClass3rd
{
    public static void main(String[] args)
    {
        Runnable r=new Runnable()
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
        Thread t=new Thread(r);
        t.start();
    }
}