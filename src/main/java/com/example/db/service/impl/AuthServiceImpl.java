package com.example.db.service.impl;

import com.example.db.exceptions.InvalidArgumentsException;
import com.example.db.model.User;
import com.example.db.repository.UserRepository;
import com.example.db.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> login(String username, String password) {
        if(username==null || username.isEmpty() || password==null || password.isEmpty())
        {

            throw new InvalidArgumentsException();
        }
        return  userRepository.findByUsernameAndPassword(username,password);
    }
}