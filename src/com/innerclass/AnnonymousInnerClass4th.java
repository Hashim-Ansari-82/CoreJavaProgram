package com.innerclass;

                /*Annonymous Class through define inside arguments */

class AnnonymousInnerClass4th
{
    public static void main(String[] arga)
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1; i<=5; i++)
                {
                    System.out.println("Annonymous Class Thread");
                }
            }
        }).start();
        for(int i=1; i<=5; i++)
        {
            System.out.println("Main Thread");
        }
    }
}