package com.superhan.ticketSalesRefectoring;

/**
 * 역할: 관객이 연극을 볼 극장
 * 책임: 연극을 볼 관객을 들여보낸다.
 * 의존관계:
 *  - 관객
 *  - 티켓
 *
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
