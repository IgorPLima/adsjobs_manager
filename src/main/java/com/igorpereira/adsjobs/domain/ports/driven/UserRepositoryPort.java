package com.igorpereira.adsjobs.domain.ports.driven;

import com.igorpereira.adsjobs.domain.entity.User;

public interface UserRepositoryPort {

    User save(User user);
}
