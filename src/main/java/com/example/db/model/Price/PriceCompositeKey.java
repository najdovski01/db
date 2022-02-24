package com.example.db.model.Price;

import com.example.db.model.ProductInStore;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class PriceCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "product_in_store_id")
    public ProductInStore product_in_store;
    public Integer price_id;

    public PriceCompositeKey(ProductInStore product_in_store_id, Integer price_id) {

        this.product_in_store = product_in_store_id;
        this.price_id = price_id;
    }

    public PriceCompositeKey() {
    }

    public ProductInStore getProduct_in_store() {
        return product_in_store;
    }

    public void setProduct_in_store(ProductInStore product_in_store) {
        this.product_in_store = product_in_store;
    }

    public Integer getPrice_id() {
        return price_id;
    }

    public void setPrice_id(Integer price_id) {
        this.price_id = price_id;
    }
}