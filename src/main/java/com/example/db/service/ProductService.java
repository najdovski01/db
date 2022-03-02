package com.example.db.service;

import com.example.db.model.Product;

import java.util.List;

public interface ProductService {

    Product findByProductId(Integer id);
    List<Product> findByNames(String names);
    List<Product> findByColor(String color);
    List<Product> listAll();
}
