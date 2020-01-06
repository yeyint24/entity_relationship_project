package com.demo_yeyint.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Food_Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "supplier_id_fk")
    private Supplier supplier;

    @ManyToMany
    private List<Animals> animalsList=new ArrayList<>();

    public Food_Item(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }

    public List<Animals> getAnimalsList() {
        return animalsList;
    }

    public void setAnimalsList(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Food_Item() {
    }
    public Food_Item(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food_Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", supplier=" + supplier +

                '}';
    }
}
