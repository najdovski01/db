package com.example.db.service;

import com.example.db.model.Users;

import java.util.Optional;

public interface AuthService {
    public Optional<Users> login(String username, String password);

}