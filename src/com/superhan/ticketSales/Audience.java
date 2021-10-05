package com.superhan.ticketSales;

/**
 * 정의: 청중
 * 역할: 공연을 관람할 청중이다. 소지품을 가지고 있으며, 소지품은 가방에 보관한다.
 * 책임: 공연 관람을 위해 티켓을 구매하거나 초대장을 제시해야만 한다.
 * 의존 관계:
 *  - 티켓
 *  - 가방
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){
        return bag;
    }
}
