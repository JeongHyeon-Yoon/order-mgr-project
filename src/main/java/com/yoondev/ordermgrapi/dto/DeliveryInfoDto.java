package com.yoondev.ordermgrapi.dto;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;

public record DeliveryInfoDto(
        String receiver,
        String address,
        String zipCode,
        String phoneNumber,
        String deliveryMemo
) {
    public static DeliveryInfoDto of(String receiver, String address, String zipCode, String phoneNumber, String deliveryMemo){
        return new DeliveryInfoDto(receiver,address, zipCode,phoneNumber, deliveryMemo);
    }
    public static DeliveryInfoDto from(DeliveryInfo deliveryInfo){
        return new DeliveryInfoDto(
                deliveryInfo.getReceiver(),
                deliveryInfo.getAddress(),
                deliveryInfo.getZipCode(),
                deliveryInfo.getPhoneNumber(),
                deliveryInfo.getDeliveryMemo()
        );
    }
}
