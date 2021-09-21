package com.neptunecode.security_mongo.service;

import com.neptunecode.security_mongo.model.security.User;
import com.neptunecode.security_mongo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    IUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User Not Found with username: "+ username ));
        return UserDetailsImpl.build(user);
    }
}
