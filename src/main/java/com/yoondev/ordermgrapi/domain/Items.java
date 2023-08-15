package com.yoondev.ordermgrapi.domain;

import com.fasterxml.jackson.annotation.JacksonInject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@ToString(callSuper = true)
public class Items {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Setter
    @Column(nullable = false, length = 20)
    private String itemName;

    @Setter
    @Column(length = 100)
    private String itemExplain;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime regDate;

    @Setter
    @Column(nullable = false)
    private Integer costPrice;

    @Setter
    @Column(nullable = false)
    private Integer netPrice;

    @Setter
    @Column(nullable = false)
    private Integer sellPrice;

    protected Items() {}

    private Items(String itemName, String itemExplain, Integer costPrice, Integer netPrice, Integer sellPrice) {
        this.itemName = itemName;
        this.itemExplain = itemExplain;
        this.costPrice = costPrice;
        this.netPrice = netPrice;
        this.sellPrice = sellPrice;
    }
    public static Items of(String itemName, String itemExplain,  Integer costPrice, Integer netPrice, Integer sellPrice) {
        return new Items(itemName, itemExplain, costPrice, netPrice, sellPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items item = (Items) o;
        return this.getId() != null && Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }

}
