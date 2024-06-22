package com.example.restapp.service;

import com.example.restapp.data.User;
import com.example.restapp.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Retrieve all users from the database
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Retrieve a user by their ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Create a new user
    public User createUser(User user) {
        // Add any validation or business logic before saving the user
        return userRepository.save(user);
    }

    // Update an existing user
    public User updateUser(Long id, User updatedUser) {
        // Check if the user exists
        Optional<User> existingUserOptional = userRepository.findById(id);

        if (existingUserOptional.isPresent()) {
            User existingUser = existingUserOptional.get();

            // Update fields based on the updatedUser object
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setPassword(updatedUser.getPassword());

            // Save the updated user
            return userRepository.save(existingUser);
        } else {
            // Handle the case where the user with the given ID is not found
            throw new IllegalArgumentException("User not found with ID: " + id);
        }
    }

    // Delete a user by their ID
    public void deleteUserById(Long id) {
        // Check if the user exists
        if (userRepository.existsById(id)) {
            // Delete the user
            userRepository.deleteById(id);
        } else {
            // Handle the case where the user with the given ID is not found
            throw new IllegalArgumentException("User not found with ID: " + id);
        }
    }
}
