package com.example.db.model.Exists;

import com.example.db.model.Catalogue.Catalogue;
import com.example.db.model.OnlineStores;
import com.example.db.model.ProductInStore;
import com.example.db.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ExistsCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="catalogue_id")
    public Catalogue catalogue;

    @ManyToOne
    @JoinColumn(name="product_in_store_id")
    public ProductInStore productInStore;

    @ManyToOne
    @JoinColumn(name="store_id")
    public OnlineStores onlineStores;

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public ProductInStore getProductInStore() {
        return productInStore;
    }

    public void setProductInStore(ProductInStore productInStore) {
        this.productInStore = productInStore;
    }

    public OnlineStores getOnlineStores() {
        return onlineStores;
    }

    public void setOnlineStores(OnlineStores onlineStores) {
        this.onlineStores = onlineStores;
    }
}
