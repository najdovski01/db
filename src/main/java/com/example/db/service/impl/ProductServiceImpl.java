package com.example.db.service.impl;

import com.example.db.exceptions.InvalidArgumentsException;
import com.example.db.model.Product;
import com.example.db.repository.ProductRepository;
import com.example.db.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByProductId(Integer id) {
        return this.productRepository.findById(id).orElseThrow(InvalidArgumentsException::new);
    }

    @Override
    public List<Product> findByNames(String names) {
        if(names == null || names.isEmpty()){
            throw new InvalidArgumentsException();
        }
        return this.productRepository.findProductByNames(names);
    }

    @Override
    public List<Product> findByColor(String color) {
        if(color == null || color.isEmpty()){
            throw new InvalidArgumentsException();
        }
        return this.productRepository.findProductByColor(color);
    }

    @Override
    public List<Product> listAll() {
        return this.productRepository.findAll();
    }
}
