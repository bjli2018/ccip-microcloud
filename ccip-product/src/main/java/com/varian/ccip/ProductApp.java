package com.varian.ccip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.varian.ccip.mapper")
public class ProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class,args);
    }
}
