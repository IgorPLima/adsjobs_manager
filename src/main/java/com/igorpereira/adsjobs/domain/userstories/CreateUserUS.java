package com.igorpereira.adsjobs.domain.userstories;

import com.igorpereira.adsjobs.domain.entity.User;
import com.igorpereira.adsjobs.domain.ports.driver.CreateUserPort;

import java.util.UUID;

public class CreateUserUS implements CreateUserPort {

    @Override
    public User execute(User user) {
        user.setId(UUID.randomUUID().toString());
        user.setEnable(false);

        //Assumir que o cliente foi persistido na base de dados
        return null;
    }
}
