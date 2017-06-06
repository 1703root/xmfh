package com.tedu.service.impl;

import com.tedu.mapper.OrderMapper;
import com.tedu.pojo.Order;
import com.tedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/4.
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public Order findOrderByUserId(String userId) {
        return orderMapper.findOrderByUserId(userId);
    }

    @Override
    public void updateOrderState(String orderId,Integer paystate) {
        orderMapper.updateOrderState(orderId,paystate);
    }

    @Override
    public void saveOrder(Order order) {
        orderMapper.saveOrder(order);
    }

    @Override
    public void deleteOrder(String orderId) {orderMapper.deleteOrder(orderId);}
}
