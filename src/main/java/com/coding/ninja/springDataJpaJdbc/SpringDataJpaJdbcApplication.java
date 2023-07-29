package com.coding.ninja.springDataJpaJdbc;

import com.coding.ninja.springDataJpaJdbc.jdbc.PersonDaoJdbc;
import com.coding.ninja.springDataJpaJdbc.model.Person;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class SpringDataJpaJdbcApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonDaoJdbc daoJdbc;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Finding all from person table");
		logger.info(daoJdbc.getAll().toString());
		System.out.println("Find by person ID");
		logger.info(daoJdbc.findById(1).toString());
		System.out.println("Update by person ID");
		logger.info(daoJdbc.updateById(2).toString());
		System.out.println("Delete by person ID");
		Person pp = daoJdbc.findById(6);
		logger.info(daoJdbc.deleteById(pp).toString());

	}
}
