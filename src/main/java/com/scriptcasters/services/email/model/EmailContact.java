package com.scriptcasters.services.email.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class EmailContact {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long emailContactId;
    @JsonIgnore
    @OneToMany
    private List<GeneralMail> mailLog;
    @Column
    private String emailAddress;
    @Column
    private String emailName;
    @Column
    private String emailContactDescription;
}
