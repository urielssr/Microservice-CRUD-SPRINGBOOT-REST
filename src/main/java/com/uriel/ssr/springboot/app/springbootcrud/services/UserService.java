package com.uriel.ssr.springboot.app.springbootcrud.services;

import java.util.List;

import com.uriel.ssr.springboot.app.springbootcrud.entities.User;

public interface UserService {
    
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
