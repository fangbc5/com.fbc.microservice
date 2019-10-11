package com.fbc.ms.service.movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

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
public class MovieApplication {
    private static final Logger logger = LoggerFactory.getLogger(MovieApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
        logger.info("系统于"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"启动成功");
        System.out.println("-------------Tomcat启动成功---------------");
    }

}
