package com.example.db.service;

import com.example.db.model.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    Users register(Integer user_id,
                   String user_name,
                   String surname,
                   String email,
                   String username,
                   String user_password);

}