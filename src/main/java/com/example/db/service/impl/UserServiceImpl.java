package com.example.db.service.impl;

import com.example.db.exceptions.InvalidUsernameOrPasswordException;
import com.example.db.exceptions.UserAlreadyExistsException;
import com.example.db.model.User;
import com.example.db.repository.UserRepository;
import com.example.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(Integer user_id, String user_name, String surname, String email, String username, String password) {
        if (username==null || password==null || username.isEmpty()  || password.isEmpty())
            throw new InvalidUsernameOrPasswordException();
        if(this.userRepository.findByUsername(username).isPresent())
            throw new UserAlreadyExistsException(username);
        User user = new User(user_id, user_name, surname, email, username, passwordEncoder.encode(password));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String usernames) {
        return userRepository.findByUsername(usernames)
                .orElseThrow(()->new UsernameNotFoundException(usernames));
    }
}