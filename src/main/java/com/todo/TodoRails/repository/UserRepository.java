package com.todo.TodoRails.repository;

import com.todo.TodoRails.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Method to find a user by their username
    User findByUsername(String username);

    // Method to find a user by their email
    User findByEmail(String email);

    // Method to check a user exists by their username. Should be named existsByUsername().
    boolean existsByUsername(String username);

    // Method to check a user exists by their email
    boolean existsByEmail(String email);
}
