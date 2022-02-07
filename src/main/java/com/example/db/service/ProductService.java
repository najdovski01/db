package com.example.db.service;

import com.example.db.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> findAll();

    public Optional<Product> findById(Integer product_id);

    public Optional<Product> save(Integer product_id,
                                  String names,
                                  Boolean in_store,
                                  String sizes,
                                  String color,
                                  Integer category_id);

    Optional<Product> findByCategoryId(Integer category_id);

    public void deleteById(Integer product_id);
}
