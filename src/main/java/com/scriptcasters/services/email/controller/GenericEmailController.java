package com.scriptcasters.services.email.controller;

import com.scriptcasters.services.email.model.GeneralMail;
import com.scriptcasters.services.email.service.GenericEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/general")
public class GenericEmailController {

    @Autowired
    private GenericEmailService genericEmailService;

    @PostMapping("/send")
    public ResponseEntity<?> sendGenericEmail(@RequestBody GeneralMail generalMail) {
        ResponseEntity<?> response;

        try {
            response = new ResponseEntity<>(genericEmailService.sendGenericEmail(generalMail), HttpStatus.OK);
        } catch (Exception e) {
            response = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }
}
