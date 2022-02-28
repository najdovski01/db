package com.example.db.model.WorksAs;

import com.example.db.model.Roles;
import com.example.db.model.Users;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class WorksAsCompositeKey implements Serializable {

    @ManyToOne
    @JoinColumn(name="user_id")
    public Users users;

    @ManyToOne
    @JoinColumn(name="id_role")
    public Roles roles;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}