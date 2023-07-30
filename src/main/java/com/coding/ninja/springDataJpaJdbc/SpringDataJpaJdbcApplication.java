package com.coding.ninja.springDataJpaJdbc;

import com.coding.ninja.springDataJpaJdbc.entity.Course;
import com.coding.ninja.springDataJpaJdbc.entity.Passport;
import com.coding.ninja.springDataJpaJdbc.entity.Review;
import com.coding.ninja.springDataJpaJdbc.entity.Student;
import com.coding.ninja.springDataJpaJdbc.inheritanceEntity.Employee;
import com.coding.ninja.springDataJpaJdbc.inheritanceEntity.FullTimeEmployee;
import com.coding.ninja.springDataJpaJdbc.inheritanceEntity.PartTimeEmployee;
import com.coding.ninja.springDataJpaJdbc.repository.*;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaJdbcApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonDaoJdbc daoJdbc;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	PassportRepository passportRepository;

	@Autowired
	CourseRepository courseRepository;
	@Autowired
	ReviewRepository reviewRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaJdbcApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		System.out.println("Finding all from person table");
//		logger.info(daoJdbc.getAll().toString());
//		System.out.println("Find by person ID");
//		logger.info(daoJdbc.findById(1).toString());
//		System.out.println("Update by person ID");
//		logger.info(daoJdbc.updateById(2).toString());
//		System.out.println("Delete by person ID");
//		Person pp = daoJdbc.findById(6);
//		logger.info(daoJdbc.deleteById(pp).toString());
//		Passport passport = new Passport("KLPY892542");
//		//First we have to save passport
//		passportRepository.save(passport);
//		Student student = new Student(9,"Satyas",passport);
////		student.setPassport(passport);
//
//		studentRepository.save(student);
//		logger.error(studentRepository.findAll().toString());
//		Optional<Passport> passport1 = passportRepository.findById(12);
//		logger.error("Bidirectional Relationship"+ passport1.get().getStudent().toString());

//		Course course = new Course("My First Java Course");
//		Review myreview = new Review("5", "Superb course which gives us better idea about java");
//		course.addReview(myreview);
//		myreview.setCourse(course);
//		reviewRepository.save(myreview);
//
//		courseRepository.save(course);

		Employee emp1= new FullTimeEmployee("Mukesh", 100000L);
		Employee emp2 = new PartTimeEmployee("SomeOne", 50L);

		employeeRepository.insertEmployee(emp1);
		employeeRepository.insertEmployee(emp2);

		logger.error(employeeRepository.getEmployeeList().toString());



	}
}
