package com.example.db.service.impl;

import com.example.db.exceptions.InvalidUsernameOrPasswordException;
import com.example.db.exceptions.UserAlreadyExistsException;
import com.example.db.model.Users;
import com.example.db.repository.UsersRepository;
import com.example.db.service.UsersService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    public UsersServiceImpl(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Users register(Integer user_id, String user_name, String surname, String email, String username, String user_password) {
        if (username==null || user_password==null || username.isEmpty()  || user_password.isEmpty())
            throw new InvalidUsernameOrPasswordException();
        if(this.usersRepository.findByUsername(username).isPresent())
            throw new UserAlreadyExistsException(username);
        Users users = new Users(user_id, user_name, surname, email, username, passwordEncoder.encode(user_password));
        return usersRepository.save(users);
    }

    @Override
    public UserDetails loadUserByUsername(String usernames) {
        return usersRepository.findByUsername(usernames)
                .orElseThrow(()->new UsernameNotFoundException(usernames));
    }
}