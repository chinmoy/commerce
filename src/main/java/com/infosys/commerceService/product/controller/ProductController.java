package com.infosys.commerceService.product.controller;

import com.infosys.commerceService.product.dto.ProductDto;
import com.infosys.commerceService.product.service.impl.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    public ResponseEntity<List<ProductDto>> getProducts() {
        List<ProductDto> products = productService.getProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("products/{id}")
    public ResponseEntity<ProductDto> getProducts(@PathVariable Long id) {
        ProductDto product = productService.getProduct(id);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("products")
    public ResponseEntity<ProductDto> saveProducts(@RequestBody ProductDto product) {
        ProductDto product1 = productService.saveProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @PutMapping("products")
    public ResponseEntity<ProductDto> updateProducts(@RequestBody ProductDto productDto) {
        ProductDto product1 = productService.updateProduct(productDto);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @DeleteMapping("products")
    public ResponseEntity<ProductDto> deleteProducts(@RequestBody ProductDto product) {
        ProductDto product1 = productService.deleteProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.NO_CONTENT);
    }
}
