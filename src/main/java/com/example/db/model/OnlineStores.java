package com.example.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="online_stores", schema="project")
public class OnlineStores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer store_id;
    String names;
    String web_address;
    String phone_number;
    String email;
    String social_media;

    public OnlineStores(Integer store_id, String names, String web_address, String phone_number, String email, String social_media) {
        this.store_id = store_id;
        this.names = names;
        this.web_address = web_address;
        this.phone_number = phone_number;
        this.email = email;
        this.social_media = social_media;
    }

    public OnlineStores() {

    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getWeb_address() {
        return web_address;
    }

    public void setWeb_address(String web_address) {
        this.web_address = web_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocial_media() {
        return social_media;
    }

    public void setSocial_media(String social_media) {
        this.social_media = social_media;
    }
}