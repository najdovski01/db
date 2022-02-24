package com.example.db.repository;

import com.example.db.model.StoreEmployee.StoreEmployee;
import com.example.db.model.StoreEmployee.StoreEmployeeCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreEmployeeRepository extends JpaRepository<StoreEmployee, StoreEmployeeCompositeKey> {
}