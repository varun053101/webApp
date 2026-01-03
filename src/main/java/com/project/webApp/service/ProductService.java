package com.project.webApp.service;

import com.project.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {

    // Dummy Data
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "IPhone", 50000),
            new Product(102, "Cannon Camera", 70000),
            new Product(103, "Shure Mic", 10000)
            ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product(0, "No-Item", 0));
    }

    // Add Product
    public void addProduct(Product product) {
        products.add(product);
    }

    private int getIndex(int prodId) {
        int index = -1;
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        return index;
    }

    // Update Product
    public void updateProduct(Product product) {
        products.set(getIndex(product.getProdId()), product);
    }

    public void deleteProduct(int prodId) {
        products.remove(getIndex(prodId));
    }
}
