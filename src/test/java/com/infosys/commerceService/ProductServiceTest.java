package com.infosys.commerceService;

import com.infosys.commerceService.product.dao.ProductRepository;
import com.infosys.commerceService.product.dto.ProductDto;
import com.infosys.commerceService.product.model.Category;
import com.infosys.commerceService.product.model.Product;
import com.infosys.commerceService.product.service.ProductService;
import com.infosys.commerceService.product.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    ProductRepository productRepository;

    @Autowired
    ModelMapper modelMapper;

    @Test
    void testGetUserById() {
        ProductServiceImpl productService = new ProductServiceImpl(modelMapper, productRepository);
        Long productId = 1L;
        Category cat = new Category(1L,"Lenovo", "");
        Product mockProduct = new Product(1L,"Lenovo Thinkpad",cat, "work laptop", 100.00
                ,"",10,null,null, null);

        Mockito.when(productRepository.findById(productId)).thenReturn(Optional.of(mockProduct));

        // Act
        ProductDto result = productService.getProduct(productId);


        assertNotNull(result);
        assertEquals("Lenovo Thinkpad", result.getName());
        Mockito.verify(productRepository, Mockito.times(1)).findById(productId);
    }
}
