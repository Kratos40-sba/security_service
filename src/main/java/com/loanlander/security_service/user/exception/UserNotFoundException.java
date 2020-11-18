package com.loanlander.security_service.user.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String user_id){
        super("User with id : "+user_id+" Not found");
    }
}
