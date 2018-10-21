package com.anderfred.calorrizer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CalorrizerApplication {
	private static final Logger logger = LoggerFactory.getLogger(CalorrizerApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(CalorrizerApplication.class, args);
		logger.info("*************INIT**************");
		//System.out.println(userService.getByName("fredx").get());

	}
}
