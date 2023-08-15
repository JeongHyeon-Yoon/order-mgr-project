package com.yoondev.ordermgrapi.service;

import com.yoondev.ordermgrapi.domain.DeliveryInfo;
import com.yoondev.ordermgrapi.domain.Items;
import com.yoondev.ordermgrapi.domain.OrderItem;
import com.yoondev.ordermgrapi.domain.Orders;
import com.yoondev.ordermgrapi.domain.constant.OrderStatus;
import com.yoondev.ordermgrapi.dto.OrderDto;
import com.yoondev.ordermgrapi.repository.DeliveryInfoRepository;
import com.yoondev.ordermgrapi.repository.ItemsRepository;
import com.yoondev.ordermgrapi.repository.OrdersRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@DisplayName("서비스 테스트 - 주문")
@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @InjectMocks private OrderService sut;
    @Mock private OrdersRepository ordersRepository;
    @Mock private ItemsRepository itemsRepository;
    @Mock private DeliveryInfoRepository deliveryInfoRepository;

    @DisplayName("주문조회 요청을하면 주문리스트 전체를 반환한다.")
    @Test
    void givenNothing_whenSearchRequest_thenReturnOrderListPage(){
        //given


        //when

        //then
    }

    @DisplayName("주문번호로 조회하면 주문의 상세 정보를 반환한다.")
    @Test
    void givenOrderNum_whenSearchOrder_thenReturnOrderDetail(){
        //given
        String orderNum = "23081100000001";

        //when

        //then

    }

    @DisplayName("배송정보와 상품리스트를 입력하면 주문을 등록한다.")
    @Test
    void givenDeliveryInfoAndItemList_whenRegisterOrder_thenExtractItemInfoAndRegisterDeliverInfoAndOrderDetail(){
        //given

        //when

        //then

    }

    @DisplayName("주문번호로 상태변경을 요청하면 주문상태를 변경한다.")
    @Test
    void givenOrderNum_whenRequestChangingOrderStatus_thenModifyOrderStatus(){
       //given

       //when

       //then

    }
}
