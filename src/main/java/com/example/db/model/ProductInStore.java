package com.example.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="product_in_store")
public class ProductInStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer product_in_store_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product product;

    @ManyToOne
    @JoinColumn(name = "store_id")
    public OnlineStores onlineStores;

    public ProductInStore(Integer product_in_store_id, Product product, OnlineStores onlineStores) {
        this.product_in_store_id = product_in_store_id;
        this.product = product;
        this.onlineStores = onlineStores;

    }

    public ProductInStore() {

    }

    public Integer getProduct_in_store_id() {
        return product_in_store_id;
    }

    public void setProduct_in_store_id(Integer product_in_store_id) {
        this.product_in_store_id = product_in_store_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OnlineStores getOnlineStores() {
        return onlineStores;
    }

    public void setOnlineStores(OnlineStores onlineStores) {
        this.onlineStores = onlineStores;
    }
}