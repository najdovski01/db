package com.example.db.repository;

import com.example.db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
