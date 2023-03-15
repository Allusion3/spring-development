package com.springdevelopment.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("Jean");
        boolean isValidPassword = password.equalsIgnoreCase("jean1234");
        return isValidUserName && isValidPassword;
    }
}
