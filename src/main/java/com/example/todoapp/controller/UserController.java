package com.example.todoapp.controller;

import com.example.todoapp.entities.User;
import com.example.todoapp.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @PostMapping
    public User createUser(User user) {

        return userService.createUser(user);
    }

    //gette user
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // yjib user  wahed barka by id
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return userService.getById(id);

    }

    //deleted
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.getById(id).ifPresent(user -> {
            userService.deleteUserById();
        });

    }

}
