package com.niit.c12_S5_Challenge.service;

import com.niit.c12_S5_Challenge.domain.Product;

import java.util.List;

public interface IProductService {

public Product addProduct(Product product);

public List<Product>getAllProduct();
}
