package com.scriptcasters.services.email.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/general")
public class GenericEmailController {

    @GetMapping("/welcome")
    public ResponseEntity<?> getWelcomeMessage(){
        return new ResponseEntity<>("Hello!",HttpStatus.OK);
        ArrayList
    }
}
