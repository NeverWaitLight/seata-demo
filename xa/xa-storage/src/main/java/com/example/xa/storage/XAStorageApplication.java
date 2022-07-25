package com.example.xa.storage;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoDataSourceProxy(dataSourceProxyMode = "XA")
@EnableDiscoveryClient
@SpringBootApplication
public class XAStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(XAStorageApplication.class, args);
    }

}