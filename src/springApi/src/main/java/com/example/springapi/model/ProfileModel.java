package com.example.springapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ProfileModel {
    @Id
    @GeneratedValue
    private long id;
    private  String fullName;
    private  String  phone;
    private  String  bio;

    @OneToOne(mappedBy = "profile")
    private UserModel user;
}
