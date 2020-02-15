package com.iestraining.khaman;

import org.springframework.boot.SpringApplication;

/**
*
* Spring Boot is embedded with Tomcat feature.
* Visit Tomcat URL : http://localhost:8080/hello-hello
*
*/

public class ApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
