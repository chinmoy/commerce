package com.infosys.commerceService.product.dto;

import com.infosys.commerceService.product.model.Category;
import com.infosys.commerceService.product.model.Discount;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private Category category;
    private String description;
    private Double price;
    private String image;
    private int stock_quantity;
    private Discount discount;
}
