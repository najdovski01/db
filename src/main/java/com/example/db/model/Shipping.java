package com.example.db.model;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name="shipping")
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shipping_id;
    String locations;
    ZonedDateTime date_from;
    ZonedDateTime date_to;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public Users users;

    @ManyToOne
    @JoinColumn(name = "shopping_id")
    public ShoppingBag shoppingBag;

    public Shipping(Integer shipping_id, String locations, ZonedDateTime date_from, ZonedDateTime date_to, Users users, ShoppingBag shoppingBag) {
        this.shipping_id = shipping_id;
        this.locations = locations;
        this.date_from = date_from;
        this.date_to = date_to;
        this.users = users;
        this.shoppingBag = shoppingBag;
    }

    public Shipping() {

    }

    public Integer getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(Integer shipping_id) {
        this.shipping_id = shipping_id;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public ZonedDateTime getDate_from() {
        return date_from;
    }

    public void setDate_from(ZonedDateTime date_from) {
        this.date_from = date_from;
    }

    public ZonedDateTime getDate_to() {
        return date_to;
    }

    public void setDate_to(ZonedDateTime date_to) {
        this.date_to = date_to;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(ShoppingBag shoppingBag) {
        this.shoppingBag = shoppingBag;
    }
}