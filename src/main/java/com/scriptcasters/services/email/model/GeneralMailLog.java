package com.scriptcasters.services.email.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class GeneralMailLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long mailLogId;
    @Column
    private EmailContact fromEmail;
    @Column
    private List<EmailContact> toEmails;
    @Column
    private List<EmailContact> ccEmails;
    @Column
    private List<EmailContact> bccEmails;
    @Column
    private String subject;
    @Column
    private String emailContent;

}
