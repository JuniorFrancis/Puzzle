package com.puzzle.controller;

import com.puzzle.service.CreditCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-card")
public class CreditCardController {

    @Autowired
    CreditCardService creditCardService;

    @GetMapping
    public ResponseEntity<String> helloCreditCard() {
        return this.creditCardService.hello();
    }    
}
