package com.example.db.repository;

import com.example.db.model.Orders.Orders;
import com.example.db.model.Orders.OrdersCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrdersRepository extends JpaRepository<Orders, OrdersCompositeKey> {
//    @Query(value="select * from orders",nativeQuery = true)
//    Optional<Orders> findAllOrders();
//
//    @Query(value="select * from orders where shopping_id=?",nativeQuery = true)
//    Optional<Orders> findByOrderId(Integer shopping_id);

}