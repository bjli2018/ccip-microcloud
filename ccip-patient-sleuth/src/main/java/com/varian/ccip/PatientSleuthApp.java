package com.varian.ccip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PatientSleuthApp {
    public static void main(String[] args) {
        SpringApplication.run(PatientSleuthApp.class,args);
    }
}
