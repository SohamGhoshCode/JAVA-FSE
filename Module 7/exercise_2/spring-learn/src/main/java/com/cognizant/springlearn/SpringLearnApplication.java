package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        logger.info("Starting SpringLearnApplication");
        SpringApplication.run(SpringLearnApplication.class, args);
        displayCountry();
        logger.info("SpringLearnApplication started successfully");
    }

    public static void displayCountry() {
        logger.info("Start displayCountry");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        logger.info("Country: {}", country);
        logger.info("End displayCountry");
    }
}
