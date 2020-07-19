package com.example.jwtspring.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
