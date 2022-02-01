package com.puzzle.service;

import com.puzzle.repository.BankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public ResponseEntity<String> hello() {

        return new ResponseEntity<>("Hello, it's Bank endpoint" , HttpStatus.OK);
    }
}
