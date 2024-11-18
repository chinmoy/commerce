package com.infosys.commerceService.product.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private int customer_id;
    private LocalDateTime order_date;
    private String status;
    private double total_price;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;

}
