package com.fbc.ms.service.api.movie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @ClassName IMovieApi
 * @Author fangbc
 * @Date 2019/9/28 18:27
 * @Version 1.0
 */
@FeignClient(name = "ms-movie")
public interface IMovieApi {

    @RequestMapping("/movie/getMovieName")
    String getMovieName();
}
