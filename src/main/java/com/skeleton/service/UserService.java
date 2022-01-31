package com.skeleton.service;

import com.skeleton.model.User;
import com.skeleton.repository.UserRepository;

import com.skeleton.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<String> hello() {
        String hello = encrypt("hello");

        return new ResponseEntity<>(hello , HttpStatus.OK);
    }
    
    public ResponseEntity<User> create(User user) {       
        userRepository.save(user);
        userRepository.flush();

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    public String encrypt(String string) { 
        PasswordEncoder enconder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        
        return enconder.encode(string);
    }

}
