package com.yoondev.ordermgrapi.repository;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository  extends JpaRepository<Items, Long> {
}
