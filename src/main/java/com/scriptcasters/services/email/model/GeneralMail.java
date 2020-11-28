package com.scriptcasters.services.email.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class GeneralMail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long mailLogId;
    @ManyToOne(cascade = CascadeType.ALL)
    private EmailContact fromEmail;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<EmailContact> toEmails;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<EmailContact> ccEmails;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<EmailContact> bccEmails;
    private String subject;
    private String emailContentPlainText;
    private String emailContentHtml;
    @OneToOne(cascade = CascadeType.ALL)
    private EmailStatusFlags statusFlags;


}
