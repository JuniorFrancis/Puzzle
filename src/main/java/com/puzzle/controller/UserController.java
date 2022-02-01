package com.puzzle.controller;

import java.time.LocalDate;

import com.puzzle.model.User;
import com.puzzle.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public  ResponseEntity<String> hello() {
        return this.userService.hello();
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        user.setCreatedAt(LocalDate.now());

        return userService.create(user);
    }
    
}
