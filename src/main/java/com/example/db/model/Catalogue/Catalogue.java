package com.example.db.model.Catalogue;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name="catalogue")
public class Catalogue {

    @EmbeddedId
    public CatalogueCompositeKey catalogueCompositeKey;

    @Column(name = "catalogue_id", insertable=false, updatable = false)
    Integer catalogue_id;
    ZonedDateTime catalogue_from;
    ZonedDateTime catalogue_to;
    String type_;

    public Catalogue(CatalogueCompositeKey catalogueCompositeKey, Integer catalogue_id, ZonedDateTime catalogue_from, ZonedDateTime catalogue_to, String type_) {
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

    public ZonedDateTime getCatalogue_from() {
        return catalogue_from;
    }

    public void setCatalogue_from(ZonedDateTime catalogue_from) {
        this.catalogue_from = catalogue_from;
    }

    public ZonedDateTime getCatalogue_to() {
        return catalogue_to;
    }

    public void setCatalogue_to(ZonedDateTime catalogue_to) {
        this.catalogue_to = catalogue_to;
    }

    public String getType_() {
        return type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }
}