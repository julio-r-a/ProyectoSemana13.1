package com.example.semana13proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Semana13ProyectoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Semana13ProyectoApplication.class, args);
    }

}
