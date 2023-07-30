package com.coding.ninja.springDataJpaJdbc.inheritanceEntity;

import jakarta.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee{
    private Long salary;

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "salary=" + salary +
                '}';
    }

    public FullTimeEmployee(Long salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(String name, Long salary) {
        super(name);
        this.salary = salary;
    }
}
