package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name = "ombudsman")
public class Ombudsman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;

    public Ombudsman(String name) {
        this.name = name;
    }

    public Ombudsman() {
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
