package com.example.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer product_id;
    String names;
    Boolean in_store;
    String sizes;
    String color;

    @ManyToOne
    @JoinColumn(name = "category_id")
    public Category category;

    public Product(Integer product_id, String names, Boolean in_store, String sizes, String color, Category category) {
        this.product_id = product_id;
        this.names = names;
        this.in_store = in_store;
        this.sizes = sizes;
        this.color = color;
        this.category = category;
    }

    public Product() {

    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Boolean getIn_store() {
        return in_store;
    }

    public void setIn_store(Boolean in_store) {
        this.in_store = in_store;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}