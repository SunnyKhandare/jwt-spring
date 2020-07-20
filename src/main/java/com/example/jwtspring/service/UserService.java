package com.example.jwtspring.service;

import com.example.jwtspring.entity.DAOUser;
import com.example.jwtspring.repository.UserDao;
import com.example.jwtspring.security.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserDao userRepository;

    @Transactional(readOnly = true)
    public Optional<DAOUser> getUserWithAuthorities() {
        return SecurityUtils.getCurrentUsername().flatMap(userRepository::findOneWithAuthoritiesByUsername);
    }
}
