package Oops.Association;

class Humain{
    String behaviour,nature;

   Humain(String behaviour, String nature){
    this.behaviour=behaviour;
    this.nature=nature;
   }
   public void show(){
    System.out.println("Humain Behaviour : "+behaviour+"\nHumain nature : "+nature);
   }
}
class Heart{
    int beat;
    String bloodGroup;
    Humain humain;
    Heart(int beat, String bloodGroup){
        this.beat=beat;
        this.bloodGroup=bloodGroup;
    }
    public void display(){
       humain=new Humain("Very Innocent"," is very bad");
        humain.show();
        System.out.println("Heart Beat count : "+beat);
        System.out.println("Blood Group is : "+bloodGroup);
     }
}
class Composition{
    public static void main(String[] args) {
        Heart h=new Heart(72, "D group");
        h.display();
    }
}