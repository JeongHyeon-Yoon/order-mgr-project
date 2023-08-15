package com.yoondev.ordermgrapi.dto.response;

import com.yoondev.ordermgrapi.domain.OrderItem;
import com.yoondev.ordermgrapi.domain.constant.OrderStatus;
import com.yoondev.ordermgrapi.dto.DeliveryInfoDto;
import com.yoondev.ordermgrapi.dto.OrderDto;
import com.yoondev.ordermgrapi.dto.OrderItemDto;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public record OrderResponse(
        String orderNum,
        DeliveryInfoDto deliveryInfo,
        Integer totalAmount,
        String ordered_customer_name,
        OrderStatus orderStatus,
        List<OrderItemDto> items
) {
    public static OrderResponse of(String orderNum, DeliveryInfoDto deliveryInfo, Integer totalAmount, String ordered_customer_name, OrderStatus orderStatus, List<OrderItemDto> items) {
       return new OrderResponse(orderNum, deliveryInfo, totalAmount, ordered_customer_name, orderStatus, items);
    }
    public static OrderResponse from(OrderDto dto) {
       return new OrderResponse(
               dto.orderNum(),
               dto.deliveryInfo(),
               dto.totalAmount(),
               dto.ordered_customer_name(),
               dto.orderStatus(),
               dto.items()
               );
    }

}
