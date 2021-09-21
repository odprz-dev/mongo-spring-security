package com.neptunecode.security_mongo.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface IUserDetailsService {
    UserDetails loadUserByUsername(String username);
}
