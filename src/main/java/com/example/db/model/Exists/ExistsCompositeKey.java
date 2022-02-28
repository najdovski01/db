package com.example.db.model.Exists;

import com.example.db.model.Catalogue.Catalogue;
import com.example.db.model.ProductInStore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ExistsCompositeKey implements Serializable {


    @ManyToOne
    @JoinColumn(name="catalogue_id")
    @JoinColumn(name="store_id")
    public Catalogue catalogue;

    @ManyToOne
    @JoinColumn(name="product_in_store_id")
    public ProductInStore productInStore;



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


}
