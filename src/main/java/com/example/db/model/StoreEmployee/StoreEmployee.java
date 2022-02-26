package com.example.db.model.StoreEmployee;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="store_employee")
public class StoreEmployee {

    @EmbeddedId
    StoreEmployeeCompositeKey storeEmployeeCompositeKey;

    Integer store_employee_id;

    public StoreEmployee(StoreEmployeeCompositeKey storeEmployeeCompositeKey, Integer store_employee_id) {
        this.storeEmployeeCompositeKey = storeEmployeeCompositeKey;
        this.store_employee_id = store_employee_id;
    }

    public StoreEmployee(){}

    public StoreEmployeeCompositeKey getStoreEmployeeCompositeKey() {
        return storeEmployeeCompositeKey;
    }

    public void setStoreEmployeeCompositeKey(StoreEmployeeCompositeKey storeEmployeeCompositeKey) {
        this.storeEmployeeCompositeKey = storeEmployeeCompositeKey;
    }

    public Integer getStore_employee_id() {
        return store_employee_id;
    }

    public void setStore_employee_id(Integer store_employee_id) {
        this.store_employee_id = store_employee_id;
    }

}