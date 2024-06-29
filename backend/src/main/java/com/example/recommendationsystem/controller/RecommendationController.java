package com.example.recommendationsystem.controller;

import com.example.recommendationsystem.model.Content;
import com.example.recommendationsystem.model.User;
import com.example.recommendationsystem.repository.ContentRepository;
import com.example.recommendationsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecommendationController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ContentRepository contentRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/contents")
    public List<Content> getContents() {
        return contentRepository.findAll();
    }

    @PostMapping("/recommend")
    public List<Content> recommend(@RequestBody User user) {
        // Simulate simple recommendation logic
        return contentRepository.findAll();
    }
}

