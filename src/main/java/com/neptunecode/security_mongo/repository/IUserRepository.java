package com.neptunecode.security_mongo.repository;

import com.neptunecode.security_mongo.model.security.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IUserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String userName);

    Boolean existsByUsername(String userName);

    Boolean existsByEmail(String email);
}
