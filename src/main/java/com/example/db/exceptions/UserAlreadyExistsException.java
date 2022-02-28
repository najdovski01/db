package com.example.db.exceptions;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String username){
        super(String.format("Users with username: %s already exists", username));
    }
}
