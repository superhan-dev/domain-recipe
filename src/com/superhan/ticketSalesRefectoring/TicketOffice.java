package com.superhan.ticketSalesRefectoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 정의: 매표소
 * 역할: 청중에게 티켓을 교환해주는 역할을 한다. 이때 돈을 받고 초대장을 준다.
 * 책임: 청중에게 티켓을 교환해 주어야 한다.
 * 의존 관계:
 *  - 청중
 *  - 티켓
 *  - 판매원
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket getTicket(){
        // remove 메서드를 사용하면, 특정 인덱스의 엘리먼트를 삭제하고, 삭제될 엘리먼트를 반환한다.
        return tickets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }

    public TicketOffice(Long amount, Ticket...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // audience를 인자로 받아 티켓을 구매하도록 하고 티켓에서 한장을 주고, 창구의 금액을 증가시킨다.
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
