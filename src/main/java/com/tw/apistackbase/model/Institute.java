package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "institute")
public class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50, unique = true)
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="institute_id")
    private List<Ombudsman> ombudsmans;

    public Institute() {
    }

    public Institute(String name) {
        this.name = name;
    }

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
