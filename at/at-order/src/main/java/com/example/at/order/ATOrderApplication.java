package com.example.at.order;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoDataSourceProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ATOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ATOrderApplication.class, args);
    }

}
