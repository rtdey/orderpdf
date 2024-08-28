//package com.digit.project.Digit_Book_Store.service;
//
//import com.digit.project.Digit_Book_Store.entity.Order;
//import com.digit.project.Digit_Book_Store.repository.OrderRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class OrderService {
//    @Autowired
//    private OrderRepository orderRepository;
//


//    public Order placeOrder(Order order) {
//        return orderRepository.save(order);
//    }



//    public List<Order> getOrderHistory(Long userId) {
//        return orderRepository.findByUserId(userId);
//    }
////    public Order getOrderById(Long orderId) {
////        Optional<Order> order = orderRepository.findById(orderId);
////        return order.orElse(null); // or throw an exception if order not found
////    }
//}
