package com.coding.ninja.springDataJpaJdbc.repository;

import com.coding.ninja.springDataJpaJdbc.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PersonDaoJdbc {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public List<Person> getAll(){
////        List<Person> list =
//        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
//
////        return list;
//    }

//    @PersistenceContext
    @Autowired
    EntityManager entityManager;

    public List<Person> getAll(){
        return entityManager.createQuery("select a from Person a", Person.class).getResultList();
    }

    public  Person findById(int id){
        return entityManager.find(Person.class, id);
    }


    public Person updateById(int id){
        Person pr  = entityManager.find(Person.class, id);
        pr.setLocation("Achanta Vemavaram");
        entityManager.merge(pr);
        return pr;
    }

    public String deleteById(Person person){
        Person pr  = entityManager.find(Person.class, person.getId());
        entityManager.remove(pr);

        return "Deleted";

    }



}
