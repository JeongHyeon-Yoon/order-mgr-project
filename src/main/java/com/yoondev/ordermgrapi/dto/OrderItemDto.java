package com.yoondev.ordermgrapi.dto;

import com.yoondev.ordermgrapi.domain.OrderItem;

public record OrderItemDto(
        Integer itemQuantity,
        String itemName,
        Integer itemPrice
) {
    public OrderItemDto DetailItemDto(Integer itemQuantity, String itemName, Integer itemPrice) {
        return new OrderItemDto(itemQuantity, itemName, itemPrice);
    }

    public static OrderItemDto of(Integer itemQuantity, String itemName, Integer itemPrice) {
        return new OrderItemDto(itemQuantity, itemName, itemPrice);
    }

    public static OrderItemDto from(OrderItem DetailItem){
        return new OrderItemDto(
                DetailItem.getItemQuantity(),
                DetailItem.getItemName(),
                DetailItem.getItemPrice()
        );
    }
}
