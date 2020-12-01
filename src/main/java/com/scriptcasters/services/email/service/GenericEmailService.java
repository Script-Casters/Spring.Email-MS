package com.scriptcasters.services.email.service;

import com.scriptcasters.services.email.model.EmailStatusFlags;
import com.scriptcasters.services.email.model.GeneralMail;
import com.scriptcasters.services.email.respository.GeneralMailLogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericEmailService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MailGunRestService mailGunRestService;

    @Autowired
    private GeneralMailLogRepository generalMailLogRepository;

    public GeneralMail sendGenericEmail(GeneralMail generalMail) {
        generalMail.setStatusFlags(new EmailStatusFlags());
        try {
            mailGunRestService.sendMail(generalMail);
            generalMail.getStatusFlags().setSent(true);
        } catch (Exception e) {
            generalMail.getStatusFlags().setHasErrors(true);
        }

        GeneralMail savedLog = generalMailLogRepository.save(generalMail);
        log.info("Email log saved: " + savedLog.getMailLogId());

        return savedLog;
    }
}
