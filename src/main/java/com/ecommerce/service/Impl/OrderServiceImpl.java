package com.ecommerce.service.Impl;

import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Order getOrder(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void newOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void removeOrder(Long id) {
        Order order1 = this.getOrder(id);
        if(order1!=null)
            orderRepository.delete(order1);
    }
}
