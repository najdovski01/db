package com.example.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="shopping_bag")
public class ShoppingBag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shopping_id;
    String order_date;
    String shipping_date;
    String modified;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    public ShoppingBag(Integer shopping_id, String order_date, String shipping_date, String modified, User user) {
        this.shopping_id = shopping_id;
        this.order_date = order_date;
        this.shipping_date = shipping_date;
        this.modified = modified;
        this.user = user;
    }

    public ShoppingBag() {

    }

    public Integer getShopping_id() {
        return shopping_id;
    }

    public void setShopping_id(Integer shopping_id) {
        this.shopping_id = shopping_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getShipping_date() {
        return shipping_date;
    }

    public void setShipping_date(String shipping_date) {
        this.shipping_date = shipping_date;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}