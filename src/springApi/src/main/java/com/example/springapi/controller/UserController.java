package com.example.springapi.controller;

import com.example.springapi.dto.UserRequestDTO;
import com.example.springapi.dto.UserResponseDTO;
import com.example.springapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/allUsers")
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public UserResponseDTO addUser(@RequestBody UserRequestDTO user) {
        return userService.addNewUser(user);
    }

    @GetMapping("/user/{id}")
    public UserResponseDTO getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}