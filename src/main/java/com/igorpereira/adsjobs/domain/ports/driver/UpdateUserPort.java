package com.igorpereira.adsjobs.domain.ports.driver;

import com.igorpereira.adsjobs.domain.entity.User;

public interface UpdateUserPort {

    User execute(String id, User user);
}
