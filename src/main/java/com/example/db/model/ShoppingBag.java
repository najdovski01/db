package com.example.db.model;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name="shopping_bag", schema="project")
public class ShoppingBag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shopping_id;
    ZonedDateTime order_date;
    ZonedDateTime shipping_date;
    ZonedDateTime modified;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    public ShoppingBag(Integer shopping_id, ZonedDateTime order_date, ZonedDateTime shipping_date, ZonedDateTime modified, User user) {
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

    public ZonedDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(ZonedDateTime order_date) {
        this.order_date = order_date;
    }

    public ZonedDateTime getShipping_date() {
        return shipping_date;
    }

    public void setShipping_date(ZonedDateTime shipping_date) {
        this.shipping_date = shipping_date;
    }

    public ZonedDateTime getModified() {
        return modified;
    }

    public void setModified(ZonedDateTime modified) {
        this.modified = modified;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}