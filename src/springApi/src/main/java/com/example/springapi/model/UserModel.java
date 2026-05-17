package com.example.springapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserModel {
    @Id
    @GeneratedValue
    long id;
    String username;
    String password;
    int age;

    @OneToOne
    @JoinColumn(name="profile_id")
    ProfileModel profile;
}
