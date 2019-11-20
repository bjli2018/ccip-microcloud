package com.varian.ccip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerSleuthApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerSleuthApp.class,args);
    }

}
