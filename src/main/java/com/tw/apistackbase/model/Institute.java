package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "institute")
public class Institute {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 50, unique = true)
    private String name;
    @OneToMany
    @JoinColumn(name="institute_id")
    List<Ombudsman> ombudsmans;

    public List<Ombudsman> getOmbudsmans() {
        return ombudsmans;
    }

    public void setOmbudsmans(List<Ombudsman> ombudsmans) {
        this.ombudsmans = ombudsmans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
