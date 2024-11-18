package com.infosys.commerceService.product.service.impl;

import com.infosys.commerceService.product.dao.CategoryRepository;
import com.infosys.commerceService.product.model.Category;
import com.infosys.commerceService.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategory() {
        log.info("get category");
        return categoryRepository.findAll();
    }

    public Category saveCategory(Category category) {
        log.info("Save category");
        return categoryRepository.save(category);
    }
}
