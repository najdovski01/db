package com.example.db.service.impl;

import com.example.db.model.Category;
import com.example.db.model.Product;
import com.example.db.repository.CategoryRepository;
import com.example.db.repository.ProductRepository;
import com.example.db.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Integer product_id) {
        return this.productRepository.findById(product_id);
    }

   //@Transactional
    @Override
    public Optional<Product> save(Integer product_id,
                                  String names,
                                  Boolean in_store,
                                  String sizes,
                                  String color,
                                  Integer category_id) {
        Category category = this.categoryRepository.findById(category_id).get();
        return Optional.of(this.productRepository.save(new Product(product_id,names, in_store, sizes, color, category)));
    }

    @Override
    public Optional<Product> findByCategoryId(Integer category_id) {
        return this.productRepository.findProductByCategory(category_id);
    }

    @Override
    public void deleteById(Integer product_id) {
        this.productRepository.deleteById(product_id);
    }
}
