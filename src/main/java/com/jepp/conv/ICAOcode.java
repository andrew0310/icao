package com.jepp.conv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ICAOcode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idLetter;

    private String iCode;
    private String foneticCode;
}
