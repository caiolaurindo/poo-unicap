package com.example.springapi.dto;


import com.example.springapi.model.ProfileModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserResponseDTO {
    private long id;
    private String username;
    private int age;
    private ProfileModel profileModel;
    private List<PostModel> postModel;
}
