package com.example.springapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @JsonIgnore
    @ManyToMany(mappedBy = "skills")
    private Set<UserModel> users;
}
