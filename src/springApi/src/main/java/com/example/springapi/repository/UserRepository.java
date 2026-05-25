package com.example.springapi.repository;


import com.example.springapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<UserModel, Long> {
    public UserModel findByUsername(String username);
    public List<UserModel> findByAge(int age);
}
