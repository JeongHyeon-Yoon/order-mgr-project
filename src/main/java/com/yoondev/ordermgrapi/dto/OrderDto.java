package com.yoondev.ordermgrapi.dto;

import com.yoondev.ordermgrapi.domain.OrderItem;
import com.yoondev.ordermgrapi.domain.Orders;
import com.yoondev.ordermgrapi.domain.constant.OrderStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public record OrderDto(
        String orderNum,
        DeliveryInfoDto deliveryInfo,
        Integer totalAmount,
        String ordered_customer_name,
        OrderStatus orderStatus,
        List<OrderItemDto> items
) {
    public OrderDto OrderDto(String orderNum, DeliveryInfoDto deliveryInfo, Integer totalAmount,  String ordered_customer_name, OrderStatus orderStatus, List<OrderItemDto> items) {
        return new OrderDto(orderNum, deliveryInfo, totalAmount,ordered_customer_name ,orderStatus, items);
    }

    public static OrderDto of(String orderNum, DeliveryInfoDto deliveryInfo, Integer totalAmount,String ordered_customer_name, OrderStatus orderStatus, List<OrderItemDto> items) {
        return new OrderDto(orderNum, deliveryInfo, totalAmount,ordered_customer_name ,orderStatus, items);
    }

    public static OrderDto from(Orders orders) {
        return new OrderDto(
                orders.getMgrcode(),
                DeliveryInfoDto.from(orders.getDeliveryInfo()),
                orders.getTotalAmount(),
                orders.getOrdered_customer_name(),
                orders.getOrderStatus(),
                orders.getItems().stream().map(OrderItemDto::from).collect(Collectors.toList())
        );
    }
}
