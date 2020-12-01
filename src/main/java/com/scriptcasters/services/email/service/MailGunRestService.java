package com.scriptcasters.services.email.service;

import com.scriptcasters.services.email.model.GeneralMail;
import com.scriptcasters.services.email.util.mapper.MailMessageMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailGunRestService {

    @Value("${scriptcasters.ms.fromEmail}")
    private String fromEmail;

    private final JavaMailSender javaMailSender;

    public MailGunRestService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(GeneralMail generalMail) {
        SimpleMailMessage mailMessage = getMailMessage(generalMail);

        javaMailSender.send(mailMessage);
    }

    public SimpleMailMessage getMailMessage(GeneralMail generalMail) {
        SimpleMailMessage mailMessage = MailMessageMapper.INSTANCE.fromGeneralMail(generalMail);

        if ("".equals(generalMail.getFromEmail()) && generalMail.getFromEmail() == null) {
            mailMessage.setFrom(fromEmail);
        }


        return mailMessage;
    }

}
