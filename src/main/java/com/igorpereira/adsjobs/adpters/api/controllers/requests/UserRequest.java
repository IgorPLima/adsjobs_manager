package com.igorpereira.adsjobs.adpters.api.controllers.requests;

import com.igorpereira.adsjobs.domain.entity.User;
import lombok.Value;

@Value
public class UserRequest {

    private String name;
    private String password;
    private String email;

    public User toUser(){

        var user = new User();

        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);

        return user;
    }
}
