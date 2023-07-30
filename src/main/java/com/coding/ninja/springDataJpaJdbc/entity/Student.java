package com.coding.ninja.springDataJpaJdbc.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourses(Course course) {
        this.courses.add(course);
    }

    @ManyToMany
    @JoinTable(name = "STUDENTS_COURSE",
                joinColumns = @JoinColumn(name = "Student_ID"),
                inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private List<Course> courses = new ArrayList<>();

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
