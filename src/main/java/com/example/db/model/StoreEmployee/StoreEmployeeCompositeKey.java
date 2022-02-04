package com.example.db.model.StoreEmployee;

import com.example.db.model.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class StoreEmployeeCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="user_id")
    public User user;

    public StoreEmployeeCompositeKey(User user) {
        this.user = user;
    }

    public StoreEmployeeCompositeKey() {

    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }

}
