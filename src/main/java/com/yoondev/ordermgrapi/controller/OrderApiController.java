package com.yoondev.ordermgrapi.controller;

import com.yoondev.ordermgrapi.domain.Orders;
import com.yoondev.ordermgrapi.dto.OrderItemDto;
import com.yoondev.ordermgrapi.dto.request.OrderRequest;
import com.yoondev.ordermgrapi.dto.response.OrderResponse;
import com.yoondev.ordermgrapi.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderApiController {

    private final OrderService orderService;

      @GetMapping(value = "/order/list")
      @ResponseBody
      public ResponseEntity order(){
          List<OrderResponse> orders = orderService.searchOrder().stream().map(OrderResponse::from).collect(Collectors.toList());

          return ResponseEntity.status(HttpStatus.OK).body(orders);
      }
    @GetMapping("/order/{orderNum}")
    public ResponseEntity orderDetail(@PathVariable String orderNum){
        OrderResponse order = OrderResponse.from(orderService.searchOrderDetail(orderNum));

        return ResponseEntity.status(HttpStatus.OK).body(order);
    }

    @PutMapping("/order/{orderNum}/approval")
    private ResponseEntity approvalOrder(@PathVariable("orderNum") String orderNum) {

        OrderResponse orderResponse = OrderResponse.from(orderService.approvalOrder(orderNum));

        return  ResponseEntity.status(HttpStatus.OK).body(orderResponse);
    }

    @PostMapping("/order")
    private ResponseEntity order(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse = OrderResponse.from(orderService.createOrder(orderRequest));

        return ResponseEntity.status(HttpStatus.OK).body(orderResponse);
    }



}
