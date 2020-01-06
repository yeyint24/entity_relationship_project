package com.demo_yeyint.demo.domain;

import javax.persistence.*;

@Entity
public class Cage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cage_no;
    private String location;

    @OneToOne(mappedBy = "cage",cascade = CascadeType.PERSIST)
    private Animals animals;


    public Cage() {
    }

    public Cage(String cage_no,String location){
        this.cage_no=cage_no;
        this.location=location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCage_no() {
        return cage_no;
    }

    public void setCage_no(String cage_no) {
        this.cage_no = cage_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }
}
