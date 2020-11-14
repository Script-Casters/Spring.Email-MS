package com.scriptcasters.services.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@GetMapping("/welcome")
	public ResponseEntity<?> getWelcomeMessage(){
		return new ResponseEntity<>("Hello!", HttpStatus.OK);
	}

}
