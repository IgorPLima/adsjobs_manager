package com.igorpereira.adsjobs.adpters.db.jparepository;

import com.igorpereira.adsjobs.domain.entity.User;
import com.igorpereira.adsjobs.domain.ports.driven.UserRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>, UserRepositoryPort {
}
