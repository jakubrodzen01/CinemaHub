package com.example.ztpai.service;

import com.example.ztpai.entities.*;
import com.example.ztpai.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public boolean existsById(UUID uuid) {
        return userRepository.existsById(uuid);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(UUID uuid) {
        return userRepository.findById(uuid).orElse(null);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteById(UUID uuid) {
        userRepository.deleteById(uuid);
    }
}
