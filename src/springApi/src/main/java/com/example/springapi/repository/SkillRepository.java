package com.example.springapi.repository;

import com.example.springapi.model.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<SkillModel, Long> {

}
