package com.neptunecode.security_mongo.service;

import com.neptunecode.security_mongo.model.security.TestDTO;
import com.neptunecode.security_mongo.repository.ITestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService{

    @Autowired
    ITestRepository repository;

    @Override
    public TestDTO addTest(TestDTO test) {
        repository.save(test);
        return test;
    }
}
