package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private String firstName = "minerva";
    private String lastName;
    private int age;
    private String email;
}
