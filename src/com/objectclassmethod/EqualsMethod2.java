package com.objectclassmethod;

                         /*With override equals method*/

class EqualsMethod2 {

    String name;
    int rollno;

    EqualsMethod2(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
   /* public boolean equals(Object o){

        String name1=this.name;
        int rollno1=this.rollno;
        EqualsMethod2 e=(EqualsMethod2)o;
        String name2=e.name;
        int rollno2=e.rollno;
        if(name1.equals(name2) && rollno2==rollno1){
            return true;
        }
        else {
            return false;
        }
    }*/
   /* public boolean equals(Object o){
        try {
            EqualsMethod2 e = (EqualsMethod2) o;

            return name.equals(e.name) && rollno == e.rollno;
        }
        catch(ClassCastException | NullPointerException e){
            return false;
        }
    }*/
   public boolean equals(Object o){

       if(o==this){
           return true;
       }

       if(o instanceof EqualsMethod2){
           EqualsMethod2 e = (EqualsMethod2)o;

           return name.equals(e.name) && rollno == e.rollno;
       }
       else{
           return false;
       }
   }
    public static void main(String[] args){

        EqualsMethod2 e=new EqualsMethod2("Hashim",12);
        EqualsMethod2 e1=new EqualsMethod2("Rani",10);
        EqualsMethod2 e2=new EqualsMethod2("Hashim",12);
        EqualsMethod2 e3=e;

        System.out.println("1 --> "+e.equals(e2));
        System.out.println("2 --> "+e.equals(e1));
        System.out.println("3 --> "+e.equals(e3));
        System.out.println("4 --> " + e1.equals("Rani"));
        System.out.println("5 --> " + e1.equals(null));
    }
}
