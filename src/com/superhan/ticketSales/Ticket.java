package com.superhan.ticketSales;

/**
 * 정의: 티켓
 * 역할: 공연을 관람할 자격을 증명한다.
 * 책임: 티켓의 가격을 반환한다.
 * 의존관계:
 *  - Bag
 *  - Invitation
 */
public class Ticket {
    private Long fee;

    public Long getFee(){
        return fee;
    }

    public Ticket() {
    }
}
