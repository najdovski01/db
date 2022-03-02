package com.example.db.repository;

import com.example.db.model.OnlineStores;
import com.example.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findProductById(Integer id);
    List<Product> findProductByNames(String names);
    List<Product> findProductByColor(String color);
    List<OnlineStores> findProductBySizes(String sizes);

    boolean existsById(Integer id);


}