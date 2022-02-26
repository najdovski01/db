package com.example.db.repository;

import com.example.db.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
//
//    @Query(value="select * from payment ", nativeQuery = true)
//    Optional<Payment> findAllPayments();
}