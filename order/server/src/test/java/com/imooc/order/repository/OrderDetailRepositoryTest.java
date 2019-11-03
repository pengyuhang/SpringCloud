package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataObject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("11111");
        orderDetail.setOrderId("123465");
        orderDetail.setProductIcon("ssssss");
        orderDetail.setProductId("12313");
        orderDetail.setProductPrice(new BigDecimal(3.6));
        orderDetail.setProductName("红烧鱼");
        orderDetail.setProductQuantity(1);
        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result!=null);
    }
}