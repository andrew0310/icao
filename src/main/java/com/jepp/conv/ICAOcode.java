package com.jepp.conv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ICAOcode {

    @Id
    private String idLetter;

    private String iCode;
    private String foneticCode;
}
