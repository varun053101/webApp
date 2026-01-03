package com.project.webApp.service;

import com.project.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {

    // Dummy Data
    List<Product> products = Arrays.asList(
            new Product(101, "IPhone", 50000),
            new Product(102, "Cannon Camera", 70000),
            new Product(103, "Shure Mic", 10000)
            );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .get();
    }
}
