package com.hexagonal.medium.port;

import com.hexagonal.medium.domain.entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Product addProduct(Product product);

    Product removeProduct(Integer productId);
}
