package com.project.webApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int prodId;

    private String productName;
    private int price;

    public Product() {}

    public Product(int prodId, String productName, int price) {
        this.prodId = prodId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getProdId() {
        return prodId;
    }
}