package com.example.db.repository;

import com.example.db.model.ShippingEmployee.ShippingEmployee;
import com.example.db.model.ShippingEmployee.ShippingEmployeeCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShippingEmployeeRepository extends JpaRepository<ShippingEmployee, ShippingEmployeeCompositeKey> {
//    @Query(value ="select se.shipping_employee_id, u.user_name, u.surname, count(s.shipping_id) as broj_naracki\n" +
//            "from shipping_employee as se\n" +
//            "join users as u on se.user_id=u.user_id\n" +
//            "join shipping as s on se.user_id=s.user_id\n" +
//            "join shopping_bag as sb on s.shopping_id=sb.shopping_id\n" +
//            "\n" +
//            "group by 1, 2, 3;", nativeQuery = true)
//    List<ShippingEmployee> findShippingEmployeeByMostShippings();
}