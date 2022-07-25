package com.example.at.wallet;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoDataSourceProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ATWalletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ATWalletApplication.class, args);
    }

}
