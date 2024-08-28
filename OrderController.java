//package com.digit.project.Digit_Book_Store.controller;
//
//import com.digit.project.Digit_Book_Store.entity.Order;
//import com.digit.project.Digit_Book_Store.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/orders")
//public class OrderController {
//    @Autowired
//    private OrderService orderService;
//
//    @PostMapping("/place")
//    public Order placeOrder(@RequestBody Order order) {
//        return orderService.placeOrder(order);
//    }
//
//    @GetMapping("/history/{userId}")
//    public List<Order> getOrderHistory(@PathVariable Long userId) {
//        return orderService.getOrderHistory(userId);
//    }
//}
