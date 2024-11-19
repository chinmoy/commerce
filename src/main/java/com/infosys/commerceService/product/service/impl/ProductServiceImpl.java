package com.infosys.commerceService.product.service.impl;

import com.infosys.commerceService.product.dao.CategoryRepository;
import com.infosys.commerceService.product.dao.ProductRepository;
import com.infosys.commerceService.product.dto.ProductDto;
import com.infosys.commerceService.product.model.Category;
import com.infosys.commerceService.product.model.Product;
import com.infosys.commerceService.product.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {


    private final ModelMapper modelMapper;
    private final ProductRepository productRepository;

    public ProductServiceImpl(ModelMapper modelMapper, ProductRepository productRepository) {
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(p -> modelMapper.map(p, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public ProductDto getProduct(long id) {
        //Product p = productRepository.findById(id).get();
        return modelMapper.map(productRepository.findById(id).get(),ProductDto.class);
    }

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return modelMapper.map(productRepository.save(product),ProductDto.class);
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return modelMapper.map(productRepository.save(product), ProductDto.class);
    }

    @Override
    public ProductDto deleteProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        productRepository.delete(product);
        return productDto;
    }


}
