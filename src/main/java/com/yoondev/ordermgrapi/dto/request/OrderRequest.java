package com.yoondev.ordermgrapi.dto.request;

import java.util.List;
import java.util.Set;

public record OrderRequest(
        List<Long> itemId,
        List<Integer> itemQuantity,
        String orderer,
        String receiver,
        String address,
        String zipCode,
        String phoneNumber,
        String deliveryMemo
) {
    public static OrderRequest of(List<Long> itemId,  List<Integer> itemQuantity, String orderer, String receiver, String address, String zipCode, String phoneNumber, String deliveryMemo) {
       return new OrderRequest(itemId, itemQuantity, orderer, receiver, address, zipCode, phoneNumber, deliveryMemo);
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "ItemIdList=" + itemId +
                ", itemQuantityList=" + itemQuantity +
                ", orderer=" + orderer +
                ", receiver=" + receiver +
                ", address=" + address +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                ", deliveryMemo=" + deliveryMemo +
                '}';
    }
}
