package com.yoondev.ordermgrapi.repository;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeliveryInfoRepository extends JpaRepository<DeliveryInfo, Long> {
}
