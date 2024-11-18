package com.infosys.commerceService.product.dao;

import com.infosys.commerceService.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
