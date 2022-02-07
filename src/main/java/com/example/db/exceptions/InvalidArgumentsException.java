package com.example.db.exceptions;

public class InvalidArgumentsException extends RuntimeException{
    public InvalidArgumentsException(){
        super("Invalid arguments");
    }
}
