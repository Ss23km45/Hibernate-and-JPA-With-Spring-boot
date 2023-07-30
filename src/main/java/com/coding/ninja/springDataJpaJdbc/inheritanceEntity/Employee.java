package com.coding.ninja.springDataJpaJdbc.inheritanceEntity;

import jakarta.persistence.*;


//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  //Single table will be created for all three classess
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    public Integer getId() {
        return id;
    }

    protected Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
