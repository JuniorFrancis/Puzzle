package com.puzzle.controller;

import com.puzzle.service.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    BankService bankService;

    @GetMapping
    public ResponseEntity<String> helloBank() {
        return this.bankService.hello();
    }    
}
