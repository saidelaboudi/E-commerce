package com.ecommerce.service;

import com.ecommerce.model.Order;

import java.util.List;

public interface OrderService {
    public Order getOrder(Long id);

    public void newOrder(Order order);

    public void removeOrder(Long id);

    public List<Order> getAllOrders();
}
