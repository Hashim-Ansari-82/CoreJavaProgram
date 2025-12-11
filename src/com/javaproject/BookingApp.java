package com.javaproject;

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
public class BookingApp extends Thread{

    static UmrahTicketBooking u;
    int ticket;

    public void run(){
        u.bookTicket(ticket);
    }

    public static void main(String[] args) {

        u=new UmrahTicketBooking();

        BookingApp Hashim=new BookingApp();
        Hashim.ticket=30;
        Hashim.start();

        BookingApp Qasim=new BookingApp();
        Qasim.ticket=20;
        Qasim.start();

        BookingApp Salim=new BookingApp();
        Salim.ticket=20;
        Salim.start();

    }
}
