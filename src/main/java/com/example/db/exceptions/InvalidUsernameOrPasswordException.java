package com.example.db.exceptions;

public class InvalidUsernameOrPasswordException extends RuntimeException{
    public InvalidUsernameOrPasswordException(){
        super("Invalid username or password");
    }
}
