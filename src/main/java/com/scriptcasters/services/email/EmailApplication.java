package com.scriptcasters.services.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmailApplication {

	@Value("${scriptcasters.ms.name}")
	private String msName;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<?> getHelloMessage() {
		return new ResponseEntity<>("Hello!", HttpStatus.OK);
	}

	@GetMapping("/welcome")
	public ResponseEntity<?> getWelcomeMessage(){
		return new ResponseEntity<>("Welcome to the " + msName + " made by Script Casters! If you have gotten this far, good job... but I must warn... it is a dark road ahead. Please be sure to GET plenty of REST!", HttpStatus.OK);
	}

}
