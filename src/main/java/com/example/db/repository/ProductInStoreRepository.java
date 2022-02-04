package com.example.db.repository;

import com.example.db.model.ProductInStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInStoreRepository extends JpaRepository<ProductInStore, Integer> {
}
