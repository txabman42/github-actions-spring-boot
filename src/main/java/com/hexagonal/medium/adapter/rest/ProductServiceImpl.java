package com.hexagonal.medium.adapter.rest;

import com.hexagonal.medium.domain.entity.Product;
import com.hexagonal.medium.port.ProductRepository;
import com.hexagonal.medium.port.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Product getProductById(Integer productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    @Override
    public Product removeProduct(Integer productId) {
        return productRepository.removeProduct(productId);
    }
}
