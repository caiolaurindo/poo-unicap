package com.example.springapi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.springapi.model.SkillModel;
import com.example.springapi.model.UserModel;
import com.example.springapi.service.SkillService;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public ResponseEntity<List<SkillModel>> getAllSkills() {
        return ResponseEntity.ok(skillService.getAllSkills());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillModel> getSkillById(@PathVariable Long id) {
        return ResponseEntity.ok(skillService.getSkillById(id));
    }

    @PostMapping
    public ResponseEntity<SkillModel> createSkill(@RequestBody SkillModel skill) {
        return ResponseEntity.ok(skillService.createSkill(skill));
    }

    @PostMapping("/{skillId}/users/{userId}")
    public ResponseEntity<UserModel> addSkillToUser(
            @PathVariable Long skillId,
            @PathVariable Long userId
    ) {
        UserModel user = skillService.addSkillToUser(userId, skillId);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{skillId}/users/{userId}")
    public ResponseEntity<UserModel> removeSkillFromUser(
            @PathVariable Long skillId,
            @PathVariable Long userId
    ) {
        UserModel user = skillService.removeSkillFromUser(userId, skillId);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkill(@PathVariable Long id) {
        boolean deleted = skillService.deleteSkill(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
