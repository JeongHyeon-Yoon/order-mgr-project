package com.yoondev.ordermgrapi.domain;

import com.yoondev.ordermgrapi.domain.constant.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter

@ToString(callSuper = true)
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ToString.Exclude
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> items = new ArrayList<OrderItem>();

    @Setter
    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_info_id")
    private DeliveryInfo deliveryInfo;

    @Setter
    @Column(length = 14, name = "mgrcode", unique = true)
    private String mgrcode;

    @Setter
    @Column(nullable = false)
    private Integer totalAmount;

    @Setter
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

    private Orders(String mgrcode, DeliveryInfo deliveryInfo, Integer totalAmount,String ordered_customer_name, OrderStatus orderStatus, List<OrderItem> items,  LocalDateTime orderedDate) {
        this.mgrcode = mgrcode;
        this.deliveryInfo = deliveryInfo;
        this.totalAmount = totalAmount;
        this.ordered_customer_name = ordered_customer_name;
        this.orderStatus = orderStatus;
        for (OrderItem item : items) {
            this.addOrderItem(item);
        }

        this.orderedDate = orderedDate;
    }
    public void addOrderItem(OrderItem item) {
        this.items.add(item);
        item.setOrder(this);
    }

    public static Orders of(String mgrcode, DeliveryInfo deliveryInfo, Integer totalAmount,  String ordered_customer_name,List<OrderItem> items) {
        return new Orders(mgrcode, deliveryInfo,totalAmount, ordered_customer_name, OrderStatus.RECEIVED, items, LocalDateTime.now());
    }
    public static Orders of(String mgrcode, DeliveryInfo deliveryInfo, Integer totalAmount,  String ordered_customer_name, OrderStatus orderStatus, List<OrderItem> items) {
        return new Orders(mgrcode, deliveryInfo,totalAmount, ordered_customer_name,orderStatus, items, LocalDateTime.now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Orders that)) return false;
        return this.getId() != null && this.getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }

}
