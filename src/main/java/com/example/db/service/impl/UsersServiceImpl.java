package com.example.db.service.impl;

import com.example.db.exceptions.InvalidArgumentsException;
import com.example.db.exceptions.InvalidUserCredentialsException;
import com.example.db.exceptions.UserNotFoundException;
import com.example.db.model.Users;
import com.example.db.repository.UsersRepository;
import com.example.db.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<Users> findAll() {
        return this.usersRepository.findAll();
    }

    @Override
    public Users findById(Integer id) {
        return this.usersRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public Users login(String username, String userPassword) {
        if(username == null || username.isEmpty() || userPassword == null || userPassword.isEmpty())
        {
            throw new InvalidArgumentsException();
        }
        return usersRepository.findByUsernameAndUserPassword(username,userPassword)
                .orElseThrow(InvalidUserCredentialsException::new);
    }

    @Override
    public Users delete(Integer id) {
       Users u = this.findById(id);
       this.usersRepository.delete(u);
       return u;
    }
}
