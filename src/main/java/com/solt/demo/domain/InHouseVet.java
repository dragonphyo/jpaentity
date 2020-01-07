package com.solt.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "in_house_vet")
@DiscriminatorValue("IN")
public class InHouseVet extends Vet{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public InHouseVet(){}
    public InHouseVet(String name,String qualification,double salary){
        super(name,qualification);
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
