package com.tedu.service;

import com.tedu.pojo.Order;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
public interface OrderService {
    public Order findOrderByUserId(String userId);

	public void updateOrderState(String orderId, Integer paystate);

    public void saveOrder(Order order);

    void deleteOrder(String orderId);
}
