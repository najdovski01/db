package com.example.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer payment_id;

    String info;

    @ManyToOne
    @JoinColumn(name = "shopping_id")
    public ShoppingBag shoppingBag;

    public Payment(Integer payment_id, String info, ShoppingBag shoppingBag) {
        this.payment_id = payment_id;
        this.info = info;
        this.shoppingBag = shoppingBag;
    }

    public Payment() {

    }

    public Integer getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(ShoppingBag shoppingBag) {
        this.shoppingBag = shoppingBag;
    }
}