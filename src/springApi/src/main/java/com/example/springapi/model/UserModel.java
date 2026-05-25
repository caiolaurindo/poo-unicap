package com.example.springapi.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name="profile_id")
    ProfileModel profile;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference // evita loop infinito ao serializar
    private List<PostModel> posts;

    @ManyToMany
    @JoinTable(
            name = "user_skill",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<SkillModel> skills;
}
