package com.coding.ninja.springDataJpaJdbc;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataJpaJdbcApplicationTests {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Test
	void contextLoads() {
		logger.info("Test has been completed successfully");
	}

}
