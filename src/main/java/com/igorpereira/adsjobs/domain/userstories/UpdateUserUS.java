package com.igorpereira.adsjobs.domain.userstories;

import com.igorpereira.adsjobs.domain.entity.User;
import com.igorpereira.adsjobs.domain.ports.driver.UpdateUserPort;

import java.util.HashMap;

public class UpdateUserUS implements UpdateUserPort {

    private static HashMap<String, User>repository;

    static {

        repository = new HashMap<>();

        repository.put("1", new User());
        repository.put("2", new User());
        repository.put("3", new User());
        repository.put("4", new User());
    }

    @Override
    public User execute(String id, User user) {
        var userDatabase = repository.get(id);
        userDatabase.setName(user.getName());
        return userDatabase;
    }
}
