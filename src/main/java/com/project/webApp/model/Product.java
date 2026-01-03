package com.project.webApp.model;

public class Product {

    private int prodId;
    private String productName;
    private int price;

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