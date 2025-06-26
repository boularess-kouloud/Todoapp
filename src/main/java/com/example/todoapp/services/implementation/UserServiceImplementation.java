package com.example.todoapp.services.implementation;

import com.example.todoapp.entities.User;
import com.example.todoapp.repository.UserRepository;
import com.example.todoapp.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUserById() {
        // You probably want to implement this using userRepository.deleteById(id)
    }
}
