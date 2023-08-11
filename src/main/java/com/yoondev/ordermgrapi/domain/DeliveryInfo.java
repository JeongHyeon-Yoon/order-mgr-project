package com.yoondev.ordermgrapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Entity
public class DeliveryInfo {
    @Id
    @Column(name = "delivery_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryInfoId;

    @Setter
    @Column(nullable = false, length = 15)
    private String receiver;

    @Setter
    @Column(nullable = false, length = 100)
    private String address;

    @Setter
    @Column(nullable = false, length = 6)
    private String zipCode;

    @Setter
    @Column(nullable = false, length = 15)
    private String phoneNumber;

    @Setter
    @Column(length = 100)
    private String deliveryMemo;

    protected DeliveryInfo() {
    }

    private DeliveryInfo (String receiver, String address, String zipCode, String phoneNumber, String deliveryMemo) {
        this.receiver = receiver;
        this.address = address;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.deliveryMemo = deliveryMemo;
    }

    public static DeliveryInfo of(String receiver, String address, String zipCode, String phoneNumber, String deliveryMemo) {
        return new DeliveryInfo(receiver, address, zipCode, phoneNumber, deliveryMemo);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryInfo that = (DeliveryInfo) o;
        return this.getDeliveryInfoId() != null && Objects.equals(deliveryInfoId, that.deliveryInfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getDeliveryInfoId());
    }
}
