package com.igorpereira.adsjobs.domain.userstories;

import com.igorpereira.adsjobs.domain.entity.User;
import com.igorpereira.adsjobs.domain.ports.driven.UserRepositoryPort;
import com.igorpereira.adsjobs.domain.ports.driver.CreateUserPort;
import com.igorpereira.adsjobs.utils.GenerateTokens;
import lombok.RequiredArgsConstructor;

import javax.inject.Named;
import java.util.UUID;

@Named
@RequiredArgsConstructor
public class CreateUserUS implements CreateUserPort {

    private final UserRepositoryPort repository;

    @Override
    public User execute(User user) {

        if(repository.existsByEmail(user.getEmail()))
            throw new IllegalArgumentException("O Usuario já existe!");

            user.setToken(GenerateTokens.execute(6));

        return repository.save(user);
    }
}
