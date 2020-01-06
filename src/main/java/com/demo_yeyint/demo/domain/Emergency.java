package com.demo_yeyint.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emergency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String case_type;
    private String progress_so_far;

    public Emergency() {
    }
    public Emergency(String type,String case_type,String progress_so_far){
        this.type=type;
        this.case_type=type;
        this.progress_so_far=progress_so_far;
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

    public String getCase_type() {
        return case_type;
    }

    public void setCase_type(String case_type) {
        this.case_type = case_type;
    }

    public String getProgress_so_far() {
        return progress_so_far;
    }

    public void setProgress_so_far(String progress_so_far) {
        this.progress_so_far = progress_so_far;
    }
}
