package com.example.db.repository;

import com.example.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value="select * from product as p join product_in_store pis on p.product_id = pis.product_id",nativeQuery = true)
    List<Product> findAllProducts();

    @Query(value="select * from product where product_id=?",nativeQuery = true)
    Optional<Product> findProductByProductId();

    @Query(value="select * from product where category_id=?", nativeQuery = true)
    Optional<Product> findProductByCategory(Integer category_id);
}
