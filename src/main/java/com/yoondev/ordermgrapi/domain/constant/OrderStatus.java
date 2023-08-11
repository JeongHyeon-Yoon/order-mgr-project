package com.yoondev.ordermgrapi.domain.constant;

import lombok.Getter;

public enum OrderStatus {
    RECEIVED("주문접수"),
    COMPLETE("주문완료"),
    CANCEL("주문취소"),
    REFUND("환불");

    @Getter private final String description;

    OrderStatus(String description){ this.description = description; }
}
