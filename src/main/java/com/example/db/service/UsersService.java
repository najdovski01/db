package com.example.db.service;

import com.example.db.model.Users;

import java.util.List;

public interface UsersService{
    List<Users> findAll();
    Users findById(Integer user_id);
    Users login(String username, String password);
    Users delete(Integer user_id);

}