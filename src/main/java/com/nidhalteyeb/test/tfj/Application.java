package com.nidhalteyeb.test.tfj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
@SpringBootApplication
public class Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
