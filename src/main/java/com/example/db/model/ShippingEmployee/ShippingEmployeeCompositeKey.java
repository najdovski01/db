package com.example.db.model.ShippingEmployee;

import com.example.db.model.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ShippingEmployeeCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="user_id")

    public User user;

    public ShippingEmployeeCompositeKey(User user) {
        this.user = user;
    }

    public ShippingEmployeeCompositeKey() {

    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }
}

