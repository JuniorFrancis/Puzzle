package com.puzzle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PuzzleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuzzleApplication.class, args);
	}

	@GetMapping("/")
	public final String hello() {
		return "Hello, your project already up!";
	}

}
