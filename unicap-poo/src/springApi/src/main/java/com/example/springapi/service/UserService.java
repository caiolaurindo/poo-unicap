package com.example.springapi.service;

import com.example.springapi.model.UserModel;
import com.example.springapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserModel> getAllUsers(){
        return userRepository.findAll();
    }

    public UserModel addNewUser(UserModel user){
        return userRepository.save(user);
    }

    public UserModel getUserById(Long id){
        return userRepository.findById(id).get();
    }

}
