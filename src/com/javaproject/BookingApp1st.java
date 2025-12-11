package com.javaproject;

                             /*Synchronized Method*/

class UmrahTicketBooking{

    int booking_ticket=50;
   synchronized void bookTicket(int ticket){

        if(booking_ticket>=ticket) {
            System.out.println(ticket+" Ticket Book Successfully");
            booking_ticket-=ticket;
            System.out.println("Ticket left = "+booking_ticket+"\n");
        }
        else{
            System.out.println("Ticket not Available");
            System.out.println("Ticket left = "+booking_ticket+"\n");
        }

    }
}
public class BookingApp1st extends Thread{

    static UmrahTicketBooking u;
    int ticket;

    public void run(){
        u.bookTicket(ticket);
    }

    public static void main(String[] args) {

        u=new UmrahTicketBooking();

        BookingApp1st Hashim=new BookingApp1st();
        Hashim.ticket=30;
        Hashim.start();

        BookingApp1st Qasim=new BookingApp1st();
        Qasim.ticket=20;
        Qasim.start();

        BookingApp1st Salim=new BookingApp1st();
        Salim.ticket=20;
        Salim.start();

    }
}
