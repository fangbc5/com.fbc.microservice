package com.fbc.ms.ucenter.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UcenterAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcenterAuthApplication.class, args);
    }

}
