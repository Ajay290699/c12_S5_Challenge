package com.niit.c12_S5_Challenge.controller;

import com.niit.c12_S5_Challenge.domain.Product;
import com.niit.c12_S5_Challenge.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

IProductService iProductService;
    @Autowired
    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        Product product1 = iProductService.addProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

@GetMapping("/products")
    public ResponseEntity<?>getAllProduct(){
    List<Product> list= iProductService.getAllProduct();
    return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
