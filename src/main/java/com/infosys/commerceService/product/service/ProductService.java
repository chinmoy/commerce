package com.infosys.commerceService.product.service;

import com.infosys.commerceService.product.dto.ProductDto;
import com.infosys.commerceService.product.model.Product;

import java.util.List;

public interface ProductService {
    public List<ProductDto> getProducts();
    public ProductDto getProduct(long id);
    public ProductDto saveProduct(ProductDto productDto);
    public ProductDto updateProduct(ProductDto productDto);
    public ProductDto deleteProduct(ProductDto product);
}
