package com.superhan.ticketSales;

/**
 * 역할:
 *   - 티켓을 구매하기 위한 돈을 가지고 있다.
 *   - 티켓을 담는다.
 *   - 초대된 관객은 초대장을 가지고 있을 수 있다.
 * 책임:
 *  - 관객의 소지품을 보관하는 역할을 하며, 필요할 시 소지품에 대한 정보를 제공한다.
 * 의존관계:
 *  - 초대장
 *  - 티켓
 *  - 청중
 *
 */
public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(Long amount){
        this(null,amount);
    }

    public Bag(Invitation invitation, Long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hadTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }


}
