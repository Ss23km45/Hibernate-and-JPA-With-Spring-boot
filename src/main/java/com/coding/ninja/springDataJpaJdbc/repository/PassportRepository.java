package com.coding.ninja.springDataJpaJdbc.repository;

import com.coding.ninja.springDataJpaJdbc.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
