package com.yoondev.ordermgrapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Entity
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @Setter
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Items items;

    @Setter
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Orders order;

    @Column(nullable = false)
    private Integer itemQuantity;

    @Column(nullable = false, length = 20)
    private String itemName;

    @Column(nullable = false)
    private Integer itemPrice;

    protected OrderItem() {}

    private OrderItem( Items items, Integer itemQuantity, String itemName, Integer itemPrice) {
        this.items = items;
        this.itemQuantity = itemQuantity;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public static OrderItem of( Items items, Integer itemQuantity, String itemName, Integer itemPrice) {
        return new OrderItem(items,itemQuantity,itemName,itemPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem that = (OrderItem) o;
        return order.equals(that.order) && items.equals(that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, items);
    }
}
