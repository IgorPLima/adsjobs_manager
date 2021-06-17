package com.igorpereira.adsjobs.domain.userstories;

import com.igorpereira.adsjobs.domain.ports.driven.UserRepositoryPort;
import com.igorpereira.adsjobs.domain.ports.driver.EnableUserByTokenPort;
import lombok.RequiredArgsConstructor;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class EnableUserByTokensUS implements EnableUserByTokenPort {

    private final UserRepositoryPort repository;

    @Override
    public void execute(String token) {

        var user = repository.findByTokenValue(token);
        
        if(user != null && user.getToken().notHasExpired()){
            user.setEnabled(true);
            user.setToken(null);
        }
        repository.save(user);
    }
}
