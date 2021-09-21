package com.neptunecode.security_mongo.repository;

import com.neptunecode.security_mongo.model.security.ERole;
import com.neptunecode.security_mongo.model.security.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IRoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
