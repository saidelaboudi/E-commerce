package com.ecommerce.service;

import com.ecommerce.model.Order;

public interface OrderService {
    public Order getOrder(Long id);

    public void newOrder(Order order);

    public void removeOrder(Long id);
}
