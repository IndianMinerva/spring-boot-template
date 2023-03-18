package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    @JsonProperty("first_name")
    @NotEmpty(message = "First Name is required")
    private String firstName = "minerva";

    @JsonProperty("last_name")
    @NotEmpty(message = "Last Name is required")
    private String lastName;

    @Min(value = 18, message = "Age cannot be less than 18")
    private int age;

    @Email(message = "Please provide a valid email")
    private String email;
}
