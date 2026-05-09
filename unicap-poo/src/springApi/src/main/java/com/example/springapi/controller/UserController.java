package com.example.springapi.controller;


import com.example.springapi.model.UserModel;
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
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public UserModel addUser(@RequestBody UserModel user){
        return userService.addNewUser(user);
    }

    @GetMapping("/user/{i  d}")
    public UserModel getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
