package com.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SkeletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonApplication.class, args);
	}

	@GetMapping("/")
	public final String hello() {
		return "Hello, your project already up!";
	}

}
