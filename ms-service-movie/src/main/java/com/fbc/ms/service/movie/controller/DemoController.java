package com.fbc.ms.service.movie.controller;

import com.fbc.ms.service.api.user.IUserApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @ClassName DemoController
 * @Author fangbc
 * @Date 2019/9/26 21:35
 * @Version 1.0
 */
@RestController
@RequestMapping("/movie")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private IUserApi userApi;

    @RequestMapping("/getMovieName")
    public String getMovieName() {
        System.out.println("端口31001服务执行了");
        return "我是电影服务";
    }

    public String getMovieNameFallback() {
        return "电影服务熔断方法";
    }

    @HystrixCommand(fallbackMethod = "getMovieNameFallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"),
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000")},
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "1"),
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            })
    @RequestMapping("/getUsername")
    public String getUsername() {
//        String result = restTemplate.getForObject("http://localhost:31002/user/getUsername", String.class);
        System.out.println("aaaaaaaaaaaaaaaaaa");
        String result = userApi.getUsername();
        return result;
    }
}
