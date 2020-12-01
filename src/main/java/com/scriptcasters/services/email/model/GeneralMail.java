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
    private String fromEmail;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<String> toEmails;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<String> ccEmails;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<String> bccEmails;
    private String subject;
    private String contentPlainText;
    private String contentHtml;
    @OneToOne(cascade = CascadeType.ALL)
    private EmailStatusFlags statusFlags;


}
