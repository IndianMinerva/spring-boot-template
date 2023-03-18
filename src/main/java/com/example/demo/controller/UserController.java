package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    //@Autowired
    //private UserService userService;

    @GetMapping
    public String getAllUsers() {
        //return ResponseEntity.ok(List.of(new User()));
        return "Okay";
    }

    /*@PostMapping
    public ResponseEntity<Optional<User>> createUser(@RequestBody User user) {
        return userService.createUser(user)
                .map(createdUser -> ResponseEntity.ok(Optional.of(createdUser)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping
    public ResponseEntity<Optional<User>> updateUser(@PathVariable int userId, @RequestBody User user) {
        return userService.updateUser(userId, user)
                .map(updatedUser -> ResponseEntity.ok(Optional.of(updatedUser)))
                .orElse(ResponseEntity.badRequest().build());
    }

    @DeleteMapping
    public void deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
    }*/
}
