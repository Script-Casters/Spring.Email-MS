package com.scriptcasters.services.email.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class GeneralMailLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long mailLogId;
    @OneToOne(cascade = CascadeType.ALL)
    private EmailContact fromEmail;
    @JsonIgnore
    @OneToMany
    private List<EmailContact> toEmails;
    @JsonIgnore
    @OneToMany
    private List<EmailContact> ccEmails;
    @JsonIgnore
    @OneToMany
    private List<EmailContact> bccEmails;
    private String subject;
    private String emailContent;

}
