package com.fbc.ms.service.user.controller;

import com.fbc.ms.service.api.movie.IMovieApi;
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
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private IMovieApi movieApi;

    @RequestMapping("/getUsername")
    public String getUsername() {
        System.out.println(31012);
        return "我是user服务";
    }

    @RequestMapping("/getMovieName")
    public String getMovieName() {
//        String result = restTemplate.getForObject("http://ms-movie:31001/movie/getMovieName", String.class);
        String result = movieApi.getMovieName();
        return result;
    }
}
