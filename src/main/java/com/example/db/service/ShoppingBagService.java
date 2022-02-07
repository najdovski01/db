package com.example.db.service;

import com.example.db.model.ShoppingBag;

import java.util.Optional;

public interface ShoppingBagService {
    Optional<ShoppingBag> findAll();
    Optional<ShoppingBag> save(Integer shopping_id,
                               String order_date,
                               String shipping_date,
                               String modified,
                               Integer user_id);

}
