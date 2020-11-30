package com.scriptcasters.services.email.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class EmailContact {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long emailContactId;
    @ManyToOne
    private GeneralMailLog mailLog;
    @Column
    private String emailAddress;
    @Column
    private String emailName;
    @Column
    private String emailContactDescription;
}
