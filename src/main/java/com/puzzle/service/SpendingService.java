package com.puzzle.service;
import com.puzzle.repository.SpendingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class SpendingService {

    @Autowired
    SpendingRepository spendingRepository;

    public ResponseEntity<String> hello() {

        return new ResponseEntity<>("Hello, it's Spending endpoint" , HttpStatus.OK);
    }
    
}
