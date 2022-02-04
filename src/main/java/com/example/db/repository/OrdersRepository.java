package com.example.db.repository;

import com.example.db.model.Orders.Orders;
import com.example.db.model.Orders.OrdersCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, OrdersCompositeKey> {
}
