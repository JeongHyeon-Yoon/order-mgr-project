package com.yoondev.ordermgrapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@ToString(callSuper = true)
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Set<Items> items = new HashSet<>();

    @Column(nullable = false)
    private Set<Integer> itemQuantity;

    @Column(nullable = false, length = 20)
    private Set<String> itemNames;

    @Column(nullable = false)
    private Set<Integer> itemPrices;

    protected OrderDetail() {
    }

    private OrderDetail(Orders order, Set<Items> items, Set<Integer> itemQuantity, Set<String> itemNames, Set<Integer> itemPrices) {
        this.order = order;
        this.items = items;
        this.itemQuantity = itemQuantity;
        this.itemNames = itemNames;
        this.itemPrices = itemPrices;
    }

    public static OrderDetail of(Orders order, Set<Items> items, Set<Integer> itemQuantity, Set<String> itemNames, Set<Integer> itemPrices) {
        return new OrderDetail(order, items, itemQuantity, itemNames, itemPrices);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return this.getOrderDetailId() != null && Objects.equals(orderDetailId, that.orderDetailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getOrderDetailId());
    }
}
