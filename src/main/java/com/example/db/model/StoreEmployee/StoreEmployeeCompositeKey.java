package com.example.db.model.StoreEmployee;

import com.example.db.model.Users;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class StoreEmployeeCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="user_id")
    public Users users;

    public StoreEmployeeCompositeKey(Users users) {
        this.users = users;
    }

    public StoreEmployeeCompositeKey() {

    }

    public Users getUser() {
        return users;
    }


    public void setUser(Users users) {
        this.users = users;
    }

}