package com.example.db.model.Price;


import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name="price")

public class Price {

    @EmbeddedId
    public PriceCompositeKey priceCompositeKey;
    Integer price;
    ZonedDateTime price_to;
    ZonedDateTime price_from;
    public Price(PriceCompositeKey priceCompositeKey,Integer price,ZonedDateTime price_to,ZonedDateTime price_from){

        this.priceCompositeKey=priceCompositeKey;
        this.price=price;
        this.price_to=price_to;
        this.price_from=price_from;

    }
    public Price(){}

    public PriceCompositeKey getPriceCompositeKey() {
        return priceCompositeKey;
    }

    public void setPriceCompositeKey(PriceCompositeKey priceCompositeKey) {
        this.priceCompositeKey = priceCompositeKey;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ZonedDateTime getPrice_to() {
        return price_to;
    }

    public void setPrice_to(ZonedDateTime price_to) {
        this.price_to = price_to;
    }

    public ZonedDateTime getPrice_from() {
        return price_from;
    }

    public void setPrice_from(ZonedDateTime price_from) {
        this.price_from = price_from;
    }
}
