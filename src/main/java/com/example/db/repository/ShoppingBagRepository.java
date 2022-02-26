package com.example.db.repository;

import com.example.db.model.ShoppingBag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ShoppingBagRepository extends JpaRepository<ShoppingBag, Integer> {
//    @Query(value="select * from shopping_bag as sb join orders o on sb.shopping_id = o.shopping_id",nativeQuery = true)
//    Optional<ShoppingBag> findAllShoppingBags();
//
//    @Query(value="select * from shopping_bag where shopping_id=?",nativeQuery = true)
//    List<ShoppingBag> findAllByShoppingId();
}