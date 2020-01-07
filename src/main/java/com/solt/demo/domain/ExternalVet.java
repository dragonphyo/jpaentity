package com.solt.demo.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "external_vet")
@DiscriminatorValue("EX")
public class ExternalVet extends Vet{
    private String country;
    @Column(name = "visiting_fees")
    private double visitingFees;

    public ExternalVet() {
    }

    public ExternalVet(String name, String qualification,String country,double visitingFees) {
        super(name, qualification);
        this.country = country;
        this.visitingFees = visitingFees;
    }
}
