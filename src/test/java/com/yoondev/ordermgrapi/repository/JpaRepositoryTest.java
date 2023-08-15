package com.yoondev.ordermgrapi.repository;

//import com.yoondev.ordermgrapi.config.JpaConfig;
import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Items;
import com.yoondev.ordermgrapi.domain.Orders;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@DisplayName("JPA 연결 테스트")
//@Import(JpaConfig.class)
@DataJpaTest
public class JpaRepositoryTest {
    private final OrdersRepository ordersRepository;
    private final ItemsRepository itemsRepository;
    private final DeliveryInfoRepository deliveryInfoRepository;

    public JpaRepositoryTest(
            @Autowired OrdersRepository ordersRepository,
            @Autowired ItemsRepository itemsRepository,
            @Autowired DeliveryInfoRepository deliveryInfoRepository) {
        this.ordersRepository = ordersRepository;
        this.itemsRepository = itemsRepository;
        this.deliveryInfoRepository = deliveryInfoRepository;
    }

    @DisplayName("select 테스트")
    @Test
    void givenTestData_whenSelecting_thenWorksFine() {
        // Given

        // When
        List<Orders> orders = ordersRepository.findAll();
        List<DeliveryInfo> deliveryInfos = deliveryInfoRepository.findAll();
        List<Items> items = itemsRepository.findAll();

        // Then
        assertThat(orders).isNotNull().hasSize(5);
        assertThat(deliveryInfos).isNotNull().hasSize(5);
        assertThat(items).isNotNull().hasSize(20);
    }
    @DisplayName("insert 테스트")
    @Test
    void givenTestData_whenInserting_thenWorksFine() {
        // Given
        long previousCount = deliveryInfoRepository.count();

        // When
        DeliveryInfo myInfo = deliveryInfoRepository.save(
                DeliveryInfo.of("윤정현", "경기도 광명시", "33333", "01094871146", null)
        );

        // Then
        assertThat(deliveryInfoRepository.count()).isEqualTo(previousCount + 1);
    }

    @DisplayName("update 테스트")
    @Test
    void givenTestData_whenUpdating_thenWorksFine() {
        // Given
        Items items = itemsRepository.findById(1L).orElseThrow();
        int updateSellPrice = 10000;
        items.setSellPrice(updateSellPrice);

        // When
        Items saveditems = itemsRepository.saveAndFlush(items);

        // Then
        assertThat(saveditems).hasFieldOrPropertyWithValue("sellPrice", updateSellPrice);
    }

    @DisplayName("delete 테스트")
    @Test
    void givenTestData_whenDeleting_thenWorksFine() {
        // Given
        Orders orders = ordersRepository.findById(1L).orElseThrow();
        long previousOrderCount = ordersRepository.count();

        // When
        ordersRepository.delete(orders);

        // Then
        assertThat(ordersRepository.count()).isEqualTo(previousOrderCount - 1);
    }

}
