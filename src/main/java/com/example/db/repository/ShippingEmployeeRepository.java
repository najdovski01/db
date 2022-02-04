package com.example.db.repository;

import com.example.db.model.ShippingEmployee.ShippingEmployee;
import com.example.db.model.ShippingEmployee.ShippingEmployeeCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingEmployeeRepository extends JpaRepository<ShippingEmployee, ShippingEmployeeCompositeKey> {
}
