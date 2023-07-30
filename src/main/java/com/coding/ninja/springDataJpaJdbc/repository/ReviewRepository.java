package com.coding.ninja.springDataJpaJdbc.repository;

import com.coding.ninja.springDataJpaJdbc.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
