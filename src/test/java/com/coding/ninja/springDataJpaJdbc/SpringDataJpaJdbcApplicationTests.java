package com.coding.ninja.springDataJpaJdbc;

import com.coding.ninja.springDataJpaJdbc.entity.Student;
import com.coding.ninja.springDataJpaJdbc.repository.PassportRepository;
import com.coding.ninja.springDataJpaJdbc.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataJpaJdbcApplicationTests {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	PassportRepository passportRepository;

	@Test
	void contextLoads() {
		logger.info("Test has been completed successfully");
	}

	@Test
	void studentTest(){
		System.out.println("Testing PAssport number for one student");
		Optional<Student> student = studentRepository.findById(1);
		Assertions.assertEquals(student.get().getPassport().getPassportNumber().toString(), "KLPY892542");
	}

}
