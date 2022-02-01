package com.puzzle.service;
import com.puzzle.repository.CreditCardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;

    public ResponseEntity<String> hello() {

        return new ResponseEntity<>("Hello, it's CreditCard endpoint" , HttpStatus.OK);
    }
    
}
