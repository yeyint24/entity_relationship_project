package com.demo_yeyint.demo.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("In_house")
public class InHouseVet extends Vet {

    private double salary;

    public InHouseVet() {
    }

    public  InHouseVet(String name,double salary){
        super(name);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
