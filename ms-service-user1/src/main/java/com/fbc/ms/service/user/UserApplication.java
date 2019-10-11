package com.fbc.ms.service.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @ClassName Start
 * @Author fangbc
 * @Date 2019/1/4 18:35
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.fbc.ms.service.api")
@EnableHystrix
@EnableHystrixDashboard
public class UserApplication {
    private static final Logger logger = LoggerFactory.getLogger(UserApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        logger.info("系统于"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"启动成功");
        System.out.println("-------------Tomcat启动成功---------------");
    }
}
