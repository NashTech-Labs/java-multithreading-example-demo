package com.knoldus;


import com.knoldus.system.TicketBookingThread;
import com.knoldus.system.TicketCounter;

public class Client {

    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"Deepak",3);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Shashi",2);

        t1.start();
        t2.start();
    }
}