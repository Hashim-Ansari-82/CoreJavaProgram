package com.javaproject;

                                       /*Static Synchronized*/

class UmrahTicket{

    static int booking_ticket=50;
   static synchronized void bookTicket(int ticket){

        if (booking_ticket >= ticket) {
            System.out.println(ticket + " Ticket Book Successfully");
            booking_ticket -= ticket;
            System.out.println("Ticket left = " + booking_ticket + "\n");
        } else {
            System.out.println(ticket+" Ticket can't be Booked");
            System.out.println("Because Ticket left = " + booking_ticket + "\n");
        }

    }
}
class Thread1st extends Thread{

    static UmrahTicket u;
    int ticket;
     Thread1st(UmrahTicket u, int ticket){
         this.ticket=ticket;
         Thread1st.u =u;
    }
   public void run(){
         UmrahTicket.bookTicket(ticket);
    }
}
class Thread2nd extends Thread{

    static UmrahTicket u;
    int ticket;
    Thread2nd(UmrahTicket u, int ticket){
        this.ticket=ticket;
        Thread2nd.u =u;
    }
    public void run(){
        UmrahTicket.bookTicket(ticket);
    }
}
public class BookingApp3rd {

    public static void main(String[] args) {


        UmrahTicket Hashim=new UmrahTicket();

        Thread1st t1=new Thread1st(Hashim,20);
        t1.start();
        Thread2nd t2=new Thread2nd(Hashim,20);
        t2.start();
        Thread2nd t3=new Thread2nd(Hashim,3);
        t3.start();

        UmrahTicket Qasim=new UmrahTicket();
        Thread1st t5=new Thread1st(Qasim,5);
        t5.start();
        Thread2nd t4=new Thread2nd(Qasim,8);
        t4.start();

    }
}
