package com.javaproject;

                         /*Synchronized Block*/

class UmmrahTicketBook{

    static int booking_ticket=50;
     void bookTicket(int ticket){

         synchronized(UmmrahTicketBook.class) {

             if (booking_ticket >= ticket) {
                 System.out.println(ticket + " Ticket Book Successfully");
                 booking_ticket -= ticket;
                 System.out.println("Ticket left = " + booking_ticket + "\n");
             } else {
                 System.out.println(ticket+" Ticket not Available");
                 System.out.println("Ticket left = " + booking_ticket + "\n");
             }
         }
    }
}
public class BookingApp2nd extends Thread{

    static UmmrahTicketBook u;
    int ticket;

    BookingApp2nd(UmmrahTicketBook u, int ticket){
        BookingApp2nd.u =u;
        this.ticket=ticket;
    }
    public void run(){
        u.bookTicket(ticket);
    }

    public static void main(String[] args) {

        UmmrahTicketBook u =new UmmrahTicketBook();
        UmmrahTicketBook u1 =new UmmrahTicketBook();
        UmmrahTicketBook u2 =new UmmrahTicketBook();

        BookingApp2nd b1=new BookingApp2nd(u,30);
        b1.start();
        BookingApp2nd b2=new BookingApp2nd(u,20);
        b2.start();

        BookingApp2nd b4=new BookingApp2nd(u1,10);
        b4.start();
        BookingApp2nd b3=new BookingApp2nd(u1,10);
        b3.start();

        BookingApp2nd b5=new BookingApp2nd(u2,10);
        b5.start();
        BookingApp2nd b6=new BookingApp2nd(u2,10);
        b6.start();

    }
}
