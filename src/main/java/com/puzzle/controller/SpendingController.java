package com.puzzle.controller;

import com.puzzle.service.SpendingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spending")
public class SpendingController {

    @Autowired
    SpendingService spendingService;

    @GetMapping
    public ResponseEntity<String> helloSpending() {
        return this.spendingService.hello();
    }    
}
