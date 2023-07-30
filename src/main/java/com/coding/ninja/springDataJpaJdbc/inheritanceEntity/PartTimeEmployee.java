package com.coding.ninja.springDataJpaJdbc.inheritanceEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee{
    private Long hourlyWage;

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyWage=" + hourlyWage +
                '}';
    }

    protected PartTimeEmployee() {
    }

    public Long getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Long hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public PartTimeEmployee(Long hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public PartTimeEmployee(String name, Long hourlyWage) {
        super(name);
        this.hourlyWage = hourlyWage;
    }
}
