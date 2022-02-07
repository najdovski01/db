package com.example.db.service;

import com.example.db.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User register(Integer user_id,
                  String user_name,
                  String surname,
                  String email,
                  String username,
                  String password);

}
