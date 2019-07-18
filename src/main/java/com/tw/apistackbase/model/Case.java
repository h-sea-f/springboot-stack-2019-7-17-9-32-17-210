package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name = "case")
public class Case {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String caseName;
    @Column(nullable = false)
    private long caseTime;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "information_id", nullable = false)
    private CriminalInformation criminalInformation;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "institute_id", nullable = false)
    private Institute institute;

    public CriminalInformation getCriminalInformation() {
        return criminalInformation;
    }

    public void setCriminalInformation(CriminalInformation criminalInformation) {
        this.criminalInformation = criminalInformation;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

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
