package com.neptunecode.security_mongo.repository;

import com.neptunecode.security_mongo.model.security.TestDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITestRepository extends MongoRepository<TestDTO,String> {
}
