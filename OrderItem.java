//package com.digit.project.Digit_Book_Store.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//public class OrderItem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//    private int quantity;
//    private double price;
//}