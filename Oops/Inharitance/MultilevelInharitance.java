package Oops.Inharitance;

class Building{
    public void show(){
      System.out.println("Show your building");
    }
}
class Hall extends Building{
    public void see(){
      System.out.println("See my Hall");
    }
}
class Kitchen extends Hall{
  public void display(){
     System.out.println("Look At kitchen");
  }
}
class MultilevelInharitance{
    public static void main (String[] args){
      
        Kitchen k=new Kitchen();
        k.show();
        k.display();
        k.see();
    }
}