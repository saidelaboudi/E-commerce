package com.ecommerce.controller;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/newOrder")
    public void newOrder(@RequestBody Order order) {
        orderService.newOrder(order);
    }

    @GetMapping(value = "/{id}")
    public Order getOrder(Long id) {
        return orderService.getOrder(id);
    }

    @DeleteMapping(value = "remove/{id}")
    public void removeOrder(Long id) {
        orderService.removeOrder(id);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
