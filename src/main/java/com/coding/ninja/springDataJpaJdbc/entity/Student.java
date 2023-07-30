package com.coding.ninja.springDataJpaJdbc.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Student {

    public Student(String studentName, Passport passport) {
        this.studentName = studentName;
        this.passport = passport;
    }

    public Student() {
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", passport=" + passport +
                '}';
    }

    public Student(int id, String studentName, Passport passport) {
        this.id = id;
        this.studentName = studentName;
        this.passport = passport;
    }

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "STUDENTNAME")
    private String studentName;

    //Creating OneToOne Relationship
//    @OneToOne(fetch = FetchType.LAZY)
    @OneToOne
    private Passport passport;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
