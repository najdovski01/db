package com.example.db.service.impl;

import com.example.db.exceptions.InvalidArgumentsException;
import com.example.db.model.Users;
import com.example.db.repository.UsersRepository;
import com.example.db.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    private final UsersRepository usersRepository;
    public AuthServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Optional<Users> login(String username, String password) {
        if(username==null || username.isEmpty() || password==null || password.isEmpty())
        {

            throw new InvalidArgumentsException();
        }
        return  usersRepository.findByUsernameAndPassword(username,password);
    }
}