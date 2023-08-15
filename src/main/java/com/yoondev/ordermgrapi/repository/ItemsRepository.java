package com.yoondev.ordermgrapi.repository;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface ItemsRepository  extends JpaRepository<Items, Long> {

    @Query("SELECT i FROM Items i WHERE i.id IN :ids")
    List<Items> findByIdIn(@Param("ids") List<Long> ids);
}
