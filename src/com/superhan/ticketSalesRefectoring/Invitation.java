package com.superhan.ticketSalesRefectoring;

import java.time.LocalDateTime;

/**
 * 정의: 가방
 * 역할: 공연 초대에 당첨된 관객에게만 주어지는 초대장이다.
 * 책임: 공연 일시에 대한 정보를 가지고있다.
 */
public class Invitation {
    private LocalDateTime when;

    public Invitation() {
    }
}
