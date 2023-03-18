package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List getAllUsers() {
        return List.of(new User());
    }

    public Optional<User> getUserById() {
        return Optional.ofNullable(null);
    }
    @Override
    public Optional<User> createUser(User user) {
        return Optional.ofNullable(null);
    }

    @Override
    public Optional<User> updateUser(int userId, User user) {
        return Optional.of(new User());
    }

    @Override
    public void deleteUser(int userId) {

    }
}
