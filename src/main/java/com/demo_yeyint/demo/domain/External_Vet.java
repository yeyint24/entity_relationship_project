package com.demo_yeyint.demo.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("External")
public class External_Vet extends Vet {

    private String country;
    private double visiting_fees;

    public External_Vet() {
    }

    public External_Vet(String name,String country, double visiting_fees) {
        super(name);
        this.country = country;
        this.visiting_fees = visiting_fees;
    }
}
