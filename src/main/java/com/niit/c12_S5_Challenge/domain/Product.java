package com.niit.c12_S5_Challenge.domain;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int productId;
    private String productName;
    private String manfacturer;

    public Product() {
    }

    public Product(int productId, String productName, String manfacturer) {
        this.productId = productId;
        this.productName = productName;
        this.manfacturer = manfacturer;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public void setManfacturer(String manfacturer) {
        this.manfacturer = manfacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manfacturer='" + manfacturer + '\'' +
                '}';
    }
}
