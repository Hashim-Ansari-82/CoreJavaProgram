package Oops.Inharitance;

interface BookingApp {
    public void bookTicket();
}
interface AppName{
    public void feature();
}
class PlayStore implements BookingApp,AppName{

    public void feature() {
       System.err.println("Very Fast and Secure ");
    }  
    public void bookTicket() {
      System.out.println("How many ticket you Want to book ");  
   }
}
class Mobile extends PlayStore{
     public void show(){
        System.out.println("Feedback this app ");
     }
}
 public class HybridInharitance{
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.feature();
        m.bookTicket();
        m.show();
    }
}