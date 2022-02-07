package com.example.db.service;

import com.example.db.model.User;

import java.util.Optional;

public interface AuthService {
    public Optional<User> login(String username, String password);

}
