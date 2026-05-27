package com.example.springapi.service;

import com.example.springapi.dto.UserRequestDTO;
import com.example.springapi.dto.UserResponseDTO;
import com.example.springapi.model.UserModel;
import com.example.springapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserResponseDTO> getAllUsers() {

        List<UserModel> userList = userRepository.findAll();

        List<UserResponseDTO> response = new ArrayList<>();

        for (UserModel user : userList) {

            response.add(new UserResponseDTO(
                    user.getId(),
                    user.getUsername(),
                    user.getAge(),
                    user.getProfile(),
                    user.getPosts()
            ));
        }

        return response;
    }

    public UserResponseDTO addNewUser(UserRequestDTO user) {

        UserModel newUser = new UserModel();

        newUser.setPassword(user.getPassword());
        newUser.setAge(user.getAge());
        newUser.setUsername(user.getUsername());

        UserModel savedUser = userRepository.save(newUser);

        return new UserResponseDTO(
                savedUser.getId(),
                savedUser.getUsername(),
                savedUser.getAge(),
                savedUser.getProfile(),
                savedUser.getPosts()
        );
    }

    public UserResponseDTO getById(Long id) {

        UserModel user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return new UserResponseDTO(
                user.getId(),
                user.getUsername(),
                user.getAge(),
                user.getProfile(),
                user.getPosts()
        );
    }

    public UserResponseDTO updateUser(Long id, UserRequestDTO newUser) {

        UserModel user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        user.setAge(newUser.getAge());
        user.setPassword(newUser.getPassword());
        user.setUsername(newUser.getUsername());

        UserModel updatedUser = userRepository.save(user);

        return new UserResponseDTO(
                updatedUser.getId(),
                updatedUser.getUsername(),
                updatedUser.getAge(),
                updatedUser.getProfile(),
                updatedUser.getPosts()
        );
    }

    public boolean deleteById(Long id) {

        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
