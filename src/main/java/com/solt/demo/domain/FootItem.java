package com.solt.demo.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "foot_Item")
public class FootItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foot_item_id")
    private Integer id;
    private String name;
    private Long quantity;
    @JoinColumn(name = "supplier_id")
    @ManyToOne
    private Supplier supplier;

    @ManyToMany(mappedBy = "footItems",cascade = CascadeType.PERSIST)
    private List<Animal> animals = new ArrayList<>();
    public FootItem(){}
    public FootItem(String name,Long quantity){
        this.name = name;
        this.quantity = quantity;
    }


    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
