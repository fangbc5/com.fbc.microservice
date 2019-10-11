package com.fbc.framework.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @ClassName Start
 * @Author fangbc
 * @Date 2019/1/4 18:35
 * @Version 1.0
 */
@SpringBootApplication
public class Application {
    private Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("-------------Tomcat启动成功---------------");
    }
}
