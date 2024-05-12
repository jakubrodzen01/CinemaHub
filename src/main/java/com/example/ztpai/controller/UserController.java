package com.example.ztpai.controller;

import com.example.ztpai.entities.User;
import com.example.ztpai.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/getById/{uuid}")
    public User getById(@PathVariable("uuid") UUID uuid) {
        return userService.getById(uuid);
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user, HttpServletResponse response) throws IOException {
        if(user.getFirst_name() != null && user.getLast_name() != null && user.getUsername() != null && user.getPassword() != null && user.getRole() != null) {
            userService.addUser(user);
            response.sendError(HttpServletResponse.SC_OK, "User added successfully!");
            return;
        }
        response.sendError(HttpServletResponse.SC_CONFLICT, "Missing required fields!");
    }

    @DeleteMapping("/delete/{uuid}")
    public void deleteById(@PathVariable("uuid") UUID uuid, HttpServletResponse respponse) throws IOException {
        if(userService.getById(uuid) != null) {
            userService.deleteById(uuid);
            respponse.sendError(HttpServletResponse.SC_OK, "User deleted successfully!");
            return;
        }
        respponse.sendError(HttpServletResponse.SC_NOT_FOUND, "User not found!");
    }
}
