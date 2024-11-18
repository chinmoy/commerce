package com.infosys.commerceService.product.controller;

import com.infosys.commerceService.product.dao.CategoryRepository;
import com.infosys.commerceService.product.model.Category;
import com.infosys.commerceService.product.model.Product;
import com.infosys.commerceService.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("category")
    public ResponseEntity<List<Category>> getProducts() {
        List<Category> category = categoryService.getAllCategory();
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @PostMapping("category")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category c = categoryService.saveCategory(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}
