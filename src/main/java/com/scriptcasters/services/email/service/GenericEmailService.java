package com.scriptcasters.services.email.service;

import com.scriptcasters.services.email.model.GeneralMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericEmailService {

    @Autowired
    private MailGunRestService mailGunRestService;

    public GeneralMail sendGenericEmail(GeneralMail generalMail) {
        return null;
    }
}
