package com.yoondev.ordermgrapi.service;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Items;
import com.yoondev.ordermgrapi.domain.OrderItem;
import com.yoondev.ordermgrapi.domain.Orders;
import com.yoondev.ordermgrapi.domain.constant.OrderStatus;
import com.yoondev.ordermgrapi.dto.OrderDto;
import com.yoondev.ordermgrapi.dto.request.OrderRequest;
import com.yoondev.ordermgrapi.repository.DeliveryInfoRepository;
import com.yoondev.ordermgrapi.repository.ItemsRepository;
import com.yoondev.ordermgrapi.repository.OrdersRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class OrderService {
    @Autowired  private final OrdersRepository ordersRepository;
    @Autowired private final ItemsRepository itemsRepository;

    public List<OrderDto> searchOrder(){
        return ordersRepository.findAll().stream().map(OrderDto::from).collect(Collectors.toList());
    }

    public OrderDto searchOrderDetail(String orderNum){
        Long orderId = ordersRepository.findByMgrcode(orderNum)
                .orElseThrow(() -> new EntityNotFoundException("주문번호에 해당되는 주문이 없습니다. orderNum:" + orderNum))
                .getId();
        log.info("입력 값 : [" + orderNum + "], OrderId : [" + orderId + "]");

        return ordersRepository.findById(orderId)
                .map(OrderDto::from)
                .orElseThrow(() -> new EntityNotFoundException("주문이 없습니다. orderNum:" + orderNum));
    }

    public OrderDto approvalOrder(String orderNum){
        Long orderId = ordersRepository.findByMgrcode(orderNum)
                .orElseThrow(() -> new EntityNotFoundException("주문번호에 해당되는 주문이 없습니다. orderNum:" + orderNum))
                .getId();
        log.info("입력 값 : [" + orderNum + "], OrderId : [" + orderId + "]");

        Orders order = ordersRepository.findById(orderId).get();
        order.setOrderStatus(OrderStatus.COMPLETE);

        return OrderDto.from(order);
    }

    public OrderDto createOrder(OrderRequest orderRequest) {

        log.info("입력값 : " + orderRequest.toString());

        // 배송정보 생성
        DeliveryInfo deliveryInfo = DeliveryInfo.of(
                orderRequest.receiver(),
                orderRequest.address(),
                orderRequest.zipCode(),
                orderRequest.phoneNumber(),
                orderRequest.deliveryMemo()
        );

        // 주문 상세 생성
        List<Long> itemIds = orderRequest.itemId();
        List<Integer> quantitys = orderRequest.itemQuantity();

        List<Items> items = itemsRepository.findByIdIn(itemIds);

        List<OrderItem> orderItems = new ArrayList<>();
        Integer totalAmount = 0;

        for (int i = 0; i < items.size(); ++i) {
            OrderItem orderItem = OrderItem.of(
                    items.get(i),
                    quantitys.get(i),
                    items.get(i).getItemName(),
                    items.get(i).getSellPrice()
            );
            orderItems.add(orderItem);
            totalAmount += ( items.get(i).getSellPrice() * quantitys.get(i) );
        }

        //주문 생성
        Orders order = Orders.of(
                this.createMgrcode(),
                deliveryInfo,
                totalAmount,
                orderRequest.orderer(),
                orderItems
        );

        ordersRepository.save(order);

        return OrderDto.from(order);

    }

    public String createMgrcode(){

        Long orderCnt=  ordersRepository.countByOrderedDate(  LocalDate.now() );

        String mgrCode = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMdd"))
                       + String.format("%08d", orderCnt);

        log.info("생성된 관리코드 : " + mgrCode);

        return mgrCode;
    }
}
