package com.igorpereira.adsjobs.domain.ports.driver;

import com.igorpereira.adsjobs.domain.entity.User;

public interface CreateUserPort {

    User execute(User user);

}
