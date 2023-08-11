package com.yoondev.ordermgrapi.repository;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface OrdersRepository  extends JpaRepository<Orders, String> {
    List<Orders> findAllByOrderedDate(LocalDateTime orderedDate);
}
