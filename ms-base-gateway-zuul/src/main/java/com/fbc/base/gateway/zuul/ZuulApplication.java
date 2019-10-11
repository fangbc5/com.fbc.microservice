package com.fbc.base.gateway.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description
 * @ClassName Start
 * @Author fangbc
 * @Date 2019/1/4 18:35
 * @Version 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    private Logger logger = LoggerFactory.getLogger(ZuulApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        System.out.println("-------------Tomcat启动成功---------------");
    }
}
