package com.example.db.model.ShippingEmployee;

import com.example.db.model.Users;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ShippingEmployeeCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="user_id")

    public Users users;

    public ShippingEmployeeCompositeKey(Users users) {
        this.users = users;
    }

    public ShippingEmployeeCompositeKey() {

    }

    public Users getUser() {
        return users;
    }


    public void setUser(Users users) {
        this.users = users;
    }
}