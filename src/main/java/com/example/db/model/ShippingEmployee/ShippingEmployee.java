package com.example.db.model.ShippingEmployee;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="shipping_employee")
public class ShippingEmployee {

    @EmbeddedId
    ShippingEmployeeCompositeKey shippingEmployeeCompositeKey;

    Integer shipping_employee_id;

    public ShippingEmployee(ShippingEmployeeCompositeKey shippingEmployeeCompositeKey, Integer shipping_employee_id) {
        this.shippingEmployeeCompositeKey = shippingEmployeeCompositeKey;
        this.shipping_employee_id = shipping_employee_id;
    }

    public ShippingEmployee(){}

    public ShippingEmployeeCompositeKey getShippingEmployeeCompositeKey() {
        return shippingEmployeeCompositeKey;
    }

    public void setShippingEmployeeCompositeKey(ShippingEmployeeCompositeKey shippingEmployeeCompositeKey) {
        this.shippingEmployeeCompositeKey = shippingEmployeeCompositeKey;
    }

    public Integer getShipping_employee_id() {
        return shipping_employee_id;
    }

    public void setShipping_employee_id(Integer shipping_employee_id) {
        this.shipping_employee_id = shipping_employee_id;
    }
}