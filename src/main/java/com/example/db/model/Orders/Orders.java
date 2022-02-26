package com.example.db.model.Orders;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="orders")
public class Orders {

    @EmbeddedId
    private OrdersCompositeKey ordersCompositeKey;

    Integer amount;

    public Orders() {

    }

    public OrdersCompositeKey getOrdersCompositeKey() {
        return ordersCompositeKey;
    }

    public Orders(OrdersCompositeKey ordersCompositeKey, Integer amount) {
        this.ordersCompositeKey = ordersCompositeKey;
        this.amount = amount;
    }


    public void setOrdersKey(OrdersCompositeKey ordersKey) {
        this.ordersCompositeKey = ordersKey;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}