package com.superhan.ticketSalesRefectoring;

/**
 * 정의: 판매원
 * 역할: 판매소에서 티켓을 판매한다.
 * 책임: 판매소에 머물며, 청충에게 돈 또는 초대장을 받아 티켓으로 교환해준다.
 * 의존 관계:
 *  - 판매소
 */
public class TicketSeller {
    // 티켓 사무실은 다른 객체에서 접근하지 못하도록 캡슐화 한다.
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // 판매하는 동작은 sellTo 메서드를 통해서만 판매하도록하여, 객체 안에서 책임을 수행하도록 구현한다.
    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
