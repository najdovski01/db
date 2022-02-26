package com.example.db.model.Client;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Client {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer client_number_id;

    @EmbeddedId
    private ClientCompositeKey clientCompositeKey;


    public Client(ClientCompositeKey clientCompositeKey, Integer client_number_id) {
        this.clientCompositeKey = clientCompositeKey;
        this.client_number_id = client_number_id;
    }

    public Client() {

    }

    public ClientCompositeKey getClientCompositeKey() {
        return clientCompositeKey;
    }

    public void setClientCompositeKey(ClientCompositeKey clientCompositeKey) {
        this.clientCompositeKey = clientCompositeKey;
    }

    public Integer getClient_number() {
        return client_number_id;
    }

    public void setClient_number(Integer client_number) {
        this.client_number_id = client_number_id;
    }
}