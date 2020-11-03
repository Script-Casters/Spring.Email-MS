package com.scriptcasters.services.email.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
public class GeneralMailLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long mailLogId;
    @Column
    private String fromEmail;
}
