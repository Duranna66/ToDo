package com.example.demo.exception;

public class UserIsNotFound extends Exception{
    public UserIsNotFound(String message) {
        super(message);
    }
}
