package com.solt.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "foot_Item")
public class FootItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foot_item_di;
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

    public Integer getFoot_item_di() {
        return foot_item_di;
    }

    public void setFoot_item_di(Integer foot_item_di) {
        this.foot_item_di = foot_item_di;
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
