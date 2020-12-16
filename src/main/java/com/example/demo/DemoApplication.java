package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        logger.trace("Hello trace");
        logger.debug("Hello debug");
        logger.info("Hello info");
        logger.warn("Hello warn");
        logger.error("Hello error");
    }

}
