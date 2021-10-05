package com.superhan.ticketSales;

/**
 * 정의: 판매원
 * 역할: 판매소에서 티켓을 판매한다.
 * 책임: 판매소에 머물며, 청충에게 돈 또는 초대장을 받아 티켓으로 교환해준다.
 * 의존 관계:
 *  - 판매소
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }
}
