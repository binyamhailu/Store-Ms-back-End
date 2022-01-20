package com.example.reactnativedemo.controller;

import com.example.reactnativedemo.repository.UserRepository;
import com.example.reactnativedemo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/user")
public class UserController {
    private final UserRepository userRepository ;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers() {
            return ResponseEntity.ok(userRepository.findAll()) ;
    }
    @GetMapping
    private Optional<User> findById() {
       return userRepository.findById("61e5bf15337ef11926d95812") ;
    }
}
