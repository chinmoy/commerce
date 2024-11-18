package com.infosys.commerceService.product.dao;

import com.infosys.commerceService.product.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
