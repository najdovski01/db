package com.example.db.model.Client;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Data
public class Client {

    @EmbeddedId
    private ClientCompositeKey clientCompositeKey;

    Integer client_number;

    public Client(ClientCompositeKey clientCompositeKey, Integer client_number) {
        this.clientCompositeKey = clientCompositeKey;
        this.client_number = client_number;
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
        return client_number;
    }

    public void setClient_number(Integer client_number) {
        this.client_number = client_number;
    }
}
