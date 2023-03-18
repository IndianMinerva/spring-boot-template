package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List getAllUsers();

    Optional<User> createUser(User user);

    Optional<User> updateUser(int userId, User user);

    void deleteUser(int userId);
}
