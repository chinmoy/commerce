package com.infosys.commerceService.product.service;

import com.infosys.commerceService.product.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategory();
    public Category saveCategory(Category category);
}
