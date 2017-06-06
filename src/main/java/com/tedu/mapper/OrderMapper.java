package com.tedu.mapper;

import com.tedu.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/4.
 */
@Component("orderMapper")
public interface OrderMapper {

    public Order findOrderByUserId(String userId);

    public void updateOrderState(@Param("orderId") String orderId, @Param("paystate") Integer paystate);

    void saveOrder(Order order);

    void deleteOrder(String orderId);
}
