package com.solt.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animal_id;
    private String type;
    private double total_no;
    @OneToOne(mappedBy = "animal")
    private Cage cage;

    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;

    @JoinTable(name = "animal_foot_item")
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<FootItem> footItems = new ArrayList<>();
    public Animal(){}
    public Animal(String type,double total_no){
        this.type = type;
        this.total_no = total_no;
    }


    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<FootItem> getFootItems() {
        return footItems;
    }

    public void setFootItems(List<FootItem> footItems) {
        this.footItems = footItems;
    }

    public Integer getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(Integer animal_id) {
        this.animal_id = animal_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTotal_no() {
        return total_no;
    }

    public void setTotal_no(double total_no) {
        this.total_no = total_no;
    }
}
