package com.company.infrastructure.data.exceptions;

/**
 * Created by Andrey on 02.05.2017.
 */
public class UserNotFoundException extends RuntimeException{
    public  UserNotFoundException(String message){
         super(message);
    }
}
