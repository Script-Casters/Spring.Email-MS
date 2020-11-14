package com.scriptcasters.services.email.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/general")
public class GenericEmailController {

    @PostMapping("/send")
    public ResponseEntity<?> sendGenericEmail(){
        return null;
    }
}
