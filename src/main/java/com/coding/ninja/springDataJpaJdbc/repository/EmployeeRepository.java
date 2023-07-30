package com.coding.ninja.springDataJpaJdbc.repository;

import com.coding.ninja.springDataJpaJdbc.inheritanceEntity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {
    @Autowired
    EntityManager em;

    public void insertEmployee(Employee employee){
        em.persist(employee);
    }

    public List<Employee> getEmployeeList(){
        return em.createQuery("select c from Employee c", Employee.class).getResultList();
    }
}
