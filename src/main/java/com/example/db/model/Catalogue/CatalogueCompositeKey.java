package com.example.db.model.Catalogue;

import com.example.db.model.OnlineStores;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class CatalogueCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="store_id")
    public OnlineStores onlineStores;

    Integer catalogue_id;

    public CatalogueCompositeKey(OnlineStores onlineStores, Integer catalogue_id) {
        this.onlineStores = onlineStores;
        this.catalogue_id = catalogue_id;
    }
    public CatalogueCompositeKey(){}

    public OnlineStores getOnlineStores() {
        return onlineStores;
    }

    public void setOnlineStores(OnlineStores onlineStores) {
        this.onlineStores = onlineStores;
    }

    public Integer getCatalogue_id() {
        return catalogue_id;
    }

    public void setCatalogue_id(Integer catalogue_id) {
        this.catalogue_id = catalogue_id;
    }
}