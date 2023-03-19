package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List getAllUsers();

    Optional<User> getUserById(String id);

    User createUser(User user);

    User updateUser(String userId, User user);

    void deleteUser(String userId);
}
