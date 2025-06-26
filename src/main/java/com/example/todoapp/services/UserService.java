package com.example.todoapp.services;

import com.example.todoapp.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getById(int id);

    void deleteUserById();
}
