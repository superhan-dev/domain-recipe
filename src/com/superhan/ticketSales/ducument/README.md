# 티켓 판매
첫번째 이야기는 음악회나 공연이 이루어지는 소극장에서 티켓판매가 이루어지는 과정을 그린 이야기가 될 것이다.

배우들이 소극장 홍보 겸 이벤트로 무료 초청 티켓을 관객들에게 나누어 주었고,  
공연날 초청받은 관객과 티켓을 구매해서 들어오는 관객이 함께 몰렸다.  

이제 몰려오는 관객을 맞이할 차례이다.

관객 맞이는 도메인 모델의 객체들이 맡아 진행할 것이다.

# 이상한 나라의 극장
관객이 극장에 찾아왔다. 
극장은 관객의 가방을 뒤져서 초대장이 있는지 확인한다.

가방안에 초대장이 존재한다면 티켓판매원에게 티켓 한장 달라고 한 뒤, 
가방안에 넣어서 관객 돌려준다.

만약 초대장 없는 관객이라면 그의 가방에서 돈을 티켓 가격만큼 차감한 뒤,
티켓 판매자의 창구에 뺀만큼 더하여 정산한다.
정산이 끝나면 관객의 가방에 티켓을 담아 돌려준다.

이렇게 우리의 극장은 이상하고도 기묘한 극장이 된다. 

# 로직의 단점
로직의 주도는 Theater에서 주로 이루어 지고있다.
책임이 하나의 객체에 몰리고, 중앙집중형의 의존성 때문에 변경에 취약한 상황이 된다. 

만약 관객이 가방을 들고오지 않았다면?
관객의 가방을 지갑으로 변경하고, 극장안의 enter로직도 그에맞게 수정해야한다. 

OCP를 어기는 상황이 벌어진다.

# 개선점
객체들의 책임을 적절히 분배하고 외부에서 접근할 필요가 없는 객체는 캡슐화하여 감춰야한다. 
예를 들어 현재 극장 객체가 티켓판매원 객체의 사무실까지 참조할 이유가 없다. 
티켓 판매는 판매원에게 맞기고 사무실은 판매원만 알고있으면 된다. 

# Code Uml
uml은 plantuml을 통해 코드로 구현했다. 

## Plantuml Code
@startuml
class Theater {
enter()
}
class TicketSeller {
getTicketOffice()
}

class TicketOffice {
amount
getTicket()
minusAmount(amount)
plusAmount(amount)
}

class Ticket {
fee
getFee()
}

class Bag {
amount
minusAmount(amount)
plusAmount(amount)
hasInvitation()
hasTicket()
setTicket(ticket)
}

class Invitation {
when
}

Theater ..> TicketSeller
Theater ..> TicketOffice
Theater ..> Ticket
Theater ..> Bag

TicketSeller --> TicketOffice

TicketOffice --> Ticket

Bag --> Ticket
Bag --> Invitation
@enduml