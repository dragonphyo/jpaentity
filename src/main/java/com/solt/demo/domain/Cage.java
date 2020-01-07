package com.solt.demo.domain;

import javax.persistence.*;

@Entity
public class Cage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cage_id;
    private Integer cage_no;
    private String location;

    @JoinColumn(name = "animal_id")
    @OneToOne
    private Animal animal;
    public Cage(){}

    public Cage(Integer cage_no,String location){
        this.cage_no = cage_no;
        this.location = location;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Integer getCage_id() {
        return cage_id;
    }

    public void setCage_id(Integer cage_id) {
        this.cage_id = cage_id;
    }

    public Integer getCage_no() {
        return cage_no;
    }

    public void setCage_no(Integer cage_no) {
        this.cage_no = cage_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
