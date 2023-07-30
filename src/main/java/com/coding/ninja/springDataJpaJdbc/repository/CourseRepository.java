package com.coding.ninja.springDataJpaJdbc.repository;

import com.coding.ninja.springDataJpaJdbc.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
