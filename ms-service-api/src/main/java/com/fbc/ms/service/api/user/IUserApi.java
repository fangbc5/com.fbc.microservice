package com.fbc.ms.service.api.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @ClassName IUserApi
 * @Author fangbc
 * @Date 2019/9/27 20:42
 * @Version 1.0
 */
@FeignClient(name = "ms-user")
public interface IUserApi {

    @RequestMapping("/user/getUsername")
    String getUsername();
}
