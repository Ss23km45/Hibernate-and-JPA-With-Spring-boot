package com.coding.ninja.springDataJpaJdbc.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "COURSENAME")
    private String courseName;

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @OneToMany(mappedBy = "course")
    private List<Review> reviews = new ArrayList<Review>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    public int getId() {
        return id;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
