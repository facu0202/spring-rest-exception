package com.spring.rest.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.SpringRestExceptionHandlerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringRestExceptionHandlerApplication.class)
@WebAppConfiguration
public class SpringRestExceptionHandlerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
