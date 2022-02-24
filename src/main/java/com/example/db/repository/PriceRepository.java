package com.example.db.repository;

import com.example.db.model.Price.Price;
import com.example.db.model.Price.PriceCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, PriceCompositeKey> {
}