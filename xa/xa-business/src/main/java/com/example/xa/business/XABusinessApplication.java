package com.example.xa.business;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableAutoDataSourceProxy(dataSourceProxyMode = "XA")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class XABusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(XABusinessApplication.class, args);
    }

}
