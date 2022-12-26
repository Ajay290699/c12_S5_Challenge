package com.niit.c12_S5_Challenge.repository;

import com.niit.c12_S5_Challenge.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
