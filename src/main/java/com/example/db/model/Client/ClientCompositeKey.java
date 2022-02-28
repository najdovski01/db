package com.example.db.model.Client;

import com.example.db.model.Users;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ClientCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="user_id")
    public Users users;

    public ClientCompositeKey(Users users) {
        this.users = users;
    }

    public ClientCompositeKey() {

    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }
}