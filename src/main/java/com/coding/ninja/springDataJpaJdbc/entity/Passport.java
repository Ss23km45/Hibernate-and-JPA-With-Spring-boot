package com.coding.ninja.springDataJpaJdbc.entity;

import jakarta.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "PASSPORTNUMBER")
    private String passportNumber;

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
    //Bidirectional Relationship
    @OneToOne(mappedBy = "passport")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Passport() {
    }

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Passport(int id, String passportNumber) {
        this.id = id;
        this.passportNumber = passportNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
