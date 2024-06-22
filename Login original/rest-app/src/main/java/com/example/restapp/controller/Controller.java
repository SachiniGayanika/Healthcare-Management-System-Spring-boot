package com.example.restapp.controller;

import com.example.restapp.data.User;
import com.example.restapp.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/users")

public class Controller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User existingUser = userRepository.findByUsername(user.getUsername());

        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Login successful ";
        } else {
            return "Invalid credentials";
        }
    }

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        User existingUser = userRepository.findByUsername(user.getUsername());

        if (existingUser != null) {
            return "Username already exists";
        }

        userRepository.save(user);
        return "Sign up successful";
    }

}
