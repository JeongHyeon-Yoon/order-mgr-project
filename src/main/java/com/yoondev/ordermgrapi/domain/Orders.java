package com.yoondev.ordermgrapi.domain;

import com.yoondev.ordermgrapi.domain.constant.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Entity
public class Orders {
    @Id
    @Setter
    @Column(length = 14, name = "order_id")
    private String orderId;

    @Setter
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "delivery_info_id")
    private DeliveryInfo deliveryInfo;

    @Setter
    @Column(nullable = false)
    private Integer totalAmount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime orderedDate;

    @Setter
    @Column(nullable = false, length = 15)
    private String ordered_customer_name;

    @Setter
    @Column(nullable = false, length = 10)
    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;

    protected Orders() {}

    private Orders(String orderId, DeliveryInfo deliveryInfo, Integer totalAmount, String ordered_customer_name, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.deliveryInfo = deliveryInfo;
        this.totalAmount = totalAmount;
        this.ordered_customer_name = ordered_customer_name;
        this.orderStatus = orderStatus;
    }

    public static Orders of(String orderId, DeliveryInfo deliveryInfo, Integer totalAmount,  String ordered_customer_name) {
        return new Orders(orderId, deliveryInfo,totalAmount, ordered_customer_name, OrderStatus.RECEIVED);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders order = (Orders) o;
        return this.getOrderId() != null && Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getOrderId());
    }
}
