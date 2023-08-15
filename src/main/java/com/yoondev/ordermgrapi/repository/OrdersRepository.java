package com.yoondev.ordermgrapi.repository;

import com.yoondev.ordermgrapi.domain.Items;
import com.yoondev.ordermgrapi.domain.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface OrdersRepository extends JpaRepository<Orders, Long>{
    @Override
    @Query(value = "SELECT distinct o FROM Orders o join fetch o.deliveryInfo join fetch o.items", countQuery = "SELECT COUNT(o.id) FROM Orders o")
    List<Orders> findAll();

    Optional<Orders> findByMgrcode(String orderNum);

    Optional<Orders> findById(Long id);

    @Query(value = "select count(o.order_id) from orders as o where Date_format(o.ordered_date, '%Y-%m-%d') = :today", nativeQuery = true)
    Long countByOrderedDate(@Param("today") LocalDate today);
}
