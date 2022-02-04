package com.example.db.model.Catalogue;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="catalogue")
public class Catalogue {

    @EmbeddedId
    public CatalogueCompositeKey catalogueCompositeKey;

    Integer catalogue_id;
    String catalogue_from;
    String catalogue_to;
    String type_;

    public Catalogue(CatalogueCompositeKey catalogueCompositeKey, Integer catalogue_id, String catalogue_from, String catalogue_to, String type_) {
        this.catalogueCompositeKey = catalogueCompositeKey;
        this.catalogue_id = catalogue_id;
        this.catalogue_from = catalogue_from;
        this.catalogue_to = catalogue_to;
        this.type_ = type_;
    }

    public Catalogue() {

    }

    public CatalogueCompositeKey getCatalogueCompositeKey() {
        return catalogueCompositeKey;
    }

    public void setCatalogueCompositeKey(CatalogueCompositeKey catalogueCompositeKey) {
        this.catalogueCompositeKey = catalogueCompositeKey;
    }

    public Integer getCatalogue_id() {
        return catalogue_id;
    }

    public void setCatalogue_id(Integer catalogue_id) {
        this.catalogue_id = catalogue_id;
    }

    public String getCatalogue_from() {
        return catalogue_from;
    }

    public void setCatalogue_from(String catalogue_from) {
        this.catalogue_from = catalogue_from;
    }

    public String getCatalogue_to() {
        return catalogue_to;
    }

    public void setCatalogue_to(String catalogue_to) {
        this.catalogue_to = catalogue_to;
    }

    public String getType_() {
        return type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }
}
