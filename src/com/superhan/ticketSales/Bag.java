package com.superhan.ticketSales;

public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public boolean hasInvitation(){
        return invitation != null;
    }
}
