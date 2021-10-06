package com.superhan.ticketSalesRefectoring;

/**
 * 정의: 청중
 * 역할: 공연을 관람할 청중이다. 소지품을 가지고 있으며, 소지품은 가방에 보관한다.
 * 책임: 공연 관람을 위해 티켓을 구매하거나 초대장을 제시해야만 한다.
 * 의존 관계:
 *  - 티켓
 *  - 가방
 */
public class Audience {
    // bag은 어디에서도 접근하지 않도록 캡슐화 한다.
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    // 관객이 티켓을 구매할때는 buy 메서드를 통해서만 구매하게 된다.
    // 혹여 amount가 지갑으로 들어가더라도 audience만 수정하면 되므로
    // 수정이 확연하게 자유로워졌다.
    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
