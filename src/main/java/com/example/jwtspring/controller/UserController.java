package com.example.jwtspring.controller;

import com.example.jwtspring.entity.DAOUser;
import com.example.jwtspring.repository.UserDao;
import com.example.jwtspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity<DAOUser> getActualUser() {
        return ResponseEntity.ok(userService.getUserWithAuthorities().get());
    }

    @GetMapping("/adminpanel")
    public String getPanel() {
        return "This is Secured Resource";
    }
}
