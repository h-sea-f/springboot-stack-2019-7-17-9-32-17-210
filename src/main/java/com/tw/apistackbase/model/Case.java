package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name="case")
public class Case {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String caseName;
    @Column(nullable = false)
    private long caseTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public long getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(long caseTime) {
        this.caseTime = caseTime;
    }
}
