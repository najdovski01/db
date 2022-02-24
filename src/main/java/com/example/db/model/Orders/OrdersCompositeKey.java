package com.example.db.model.Orders;

import com.example.db.model.Price.Price;
import com.example.db.model.ProductInStore;
import com.example.db.model.ShoppingBag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrdersCompositeKey implements Serializable {


    @ManyToOne
    @JoinColumn(name="shopping_id")
    public ShoppingBag shoppingBag;

    @ManyToOne
    @JoinColumn(name="price_id")
    @JoinColumn(name="product_in_store_id")
    public Price price;



    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }

    public Price getPrice() {
        return price;
    }



    public void setShoppingBag(ShoppingBag shoppingBag) {
        this.shoppingBag = shoppingBag;
    }

    public void setPrice(Price price) {
        this.price = price;
    }




}