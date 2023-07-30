package com.coding.ninja.springDataJpaJdbc.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Review {
    public Review(String rating, String review) {
        this.rating = rating;
        this.review = review;
    }

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "RATING")
    private String rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Column(name = "REVIEW")
    private String review;

    public Course getCourses() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne
    private Course course;

}
