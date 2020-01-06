package com.demo_yeyint.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private int total_number;
    @ManyToOne
    @JoinColumn
    private Category category;

    @ManyToMany(mappedBy = "animalsList",cascade = CascadeType.PERSIST)
    private List<Food_Item> food_itemList=new ArrayList<>();
    @OneToOne
    private Cage cage;



    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public Animals(List<Food_Item> food_itemList) {
        this.food_itemList = food_itemList;
    }

    public List<Food_Item> getFood_itemList() {
        return food_itemList;
    }

    public void setFood_itemList(List<Food_Item> food_itemList) {
        this.food_itemList = food_itemList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Animals() {
    }
    public Animals(String type,int total_number){
        this.type=type;
        this.total_number=total_number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal_number() {
        return total_number;
    }

    public void setTotal_number(int total_number) {
        this.total_number = total_number;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", total_number=" + total_number +
                ", category=" + category +

                '}';
    }
}
