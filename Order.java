//package com.digit.project.Digit_Book_Store.entity;
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Date;
//import java.util.List;
//
//@Data
//@Entity
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private Date orderDate;
//    private double totalAmount;
//    private String status;
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<OrderItem> items;
//}
