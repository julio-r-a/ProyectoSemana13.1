package com.example.eurekaserverexa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerExaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerExaApplication.class, args);
    }

}
