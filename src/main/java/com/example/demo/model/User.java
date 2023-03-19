package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class User {
    private String id;

    @JsonProperty("first_name")
    @NotNull
    @NotEmpty(message = "First Name is required")
    private String firstName;

    @JsonProperty("last_name")
    @NotNull
    @NotEmpty(message = "Last Name is required")
    private String lastName;

    @Min(value = 18, message = "Age cannot be less than 18")
    @NotNull
    private int age;

    @Email(message = "Please provide a valid email")
    @NotNull
    private String email;
}
