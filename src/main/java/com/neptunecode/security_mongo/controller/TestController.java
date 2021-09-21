package com.neptunecode.security_mongo.controller;

import com.neptunecode.security_mongo.model.security.TestDTO;
import com.neptunecode.security_mongo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    ITestService service;

    @PostMapping("/create")
    public ResponseEntity<TestDTO> createTest(@RequestBody TestDTO test) {
        return new ResponseEntity<>(service.addTest(test), HttpStatus.OK);
    }

    @GetMapping("/all")
    public String allAccess() {
        return "Public content";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasAnyRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Content";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Access";
    }

}
