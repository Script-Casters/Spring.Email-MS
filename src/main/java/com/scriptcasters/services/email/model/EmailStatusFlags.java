package com.scriptcasters.services.email.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class EmailStatusFlags {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long statusFlagsId;
    private boolean isSent;
    private boolean hasErrors;
    private boolean isDelivered;

}
