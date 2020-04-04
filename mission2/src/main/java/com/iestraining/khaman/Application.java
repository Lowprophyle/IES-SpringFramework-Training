package com.iestraining.khaman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
*
* Spring Boot is embedded with Tomcat feature.
* Visit Tomcat URL : http://localhost:8080/
*
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
