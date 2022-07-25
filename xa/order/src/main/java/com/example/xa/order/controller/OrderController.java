package com.example.xa.order.controller;

import com.example.xa.order.model.Order;
import com.example.xa.order.repository.OrderRepository;
import org.example.xa.commons.Ordering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@Transactional
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public void submit(@RequestBody Ordering ordering) {
        Order order = new Order();
        order.setProductId(ordering.getProductId());
        order.setBill(ordering.getBill());
        orderRepository.save(order);
        if (ThreadLocalRandom.current().nextInt()%2==0) {
            throw new RuntimeException("老子不接单了");
        }
    }

    @GetMapping
    public Iterable<Order> list() {
        return orderRepository.findAll();
    }
}
