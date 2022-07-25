package com.example.xa.wallet;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoDataSourceProxy(dataSourceProxyMode = "XA")
@EnableDiscoveryClient
@SpringBootApplication
public class XAWalletApplication {

    public static void main(String[] args) {
        SpringApplication.run(XAWalletApplication.class, args);
    }

}
