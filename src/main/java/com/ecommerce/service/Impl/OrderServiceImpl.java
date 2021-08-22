package com.ecommerce.service.Impl;

import com.ecommerce.model.Order;
import com.ecommerce.model.OrderItem;
import com.ecommerce.repository.OrderItemRepository;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public Order getOrder(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void newOrder(Order order) {
        order.getItemList().stream().forEach(orderItem -> {
            OrderItem orderItem2 = orderItemRepository.save(orderItem);
            orderItem.setId(orderItem2.getId());
        });
        orderRepository.save(order);
    }

    @Override
    public void removeOrder(Long id) {
        Order order1 = this.getOrder(id);
        if (order1 != null)
            orderRepository.delete(order1);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
