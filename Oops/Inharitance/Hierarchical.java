package Oops.Inharitance;

class Forest{
    public void show(){
        System.out.println("Look the beautifull Nature ");
    }
}
class RoseTree extends Forest{
    public void look(){
        System.out.println("Rose is very Beautiful");
    }
}
class MangoTree extends Forest{
    public void taste(){
        System.out.println("Mango is very Tasty");
    }
}
class Hierarchical{
    public static void main(String[] args){
       RoseTree r=new RoseTree();
       r.show();
       r.look();
       MangoTree m=new MangoTree();
       m.taste();
       m.show();
    }
}