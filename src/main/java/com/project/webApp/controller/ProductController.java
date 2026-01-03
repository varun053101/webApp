package com.project.webApp.controller;

import com.project.webApp.model.Product;
import com.project.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService  service;

    // Get all Products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // Get Product By ID
    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // Add Product
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    // Update a product
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    // Delete product
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}