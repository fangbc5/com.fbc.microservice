package com.fbc.saas.activiti.base.controller;

import com.fbc.saas.activiti.base.interfaces.IUserService;
import com.fbc.saas.activiti.base.params.BaseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName UserController
 * @Author fangbc
 * @Date 2019/1/4 18:58
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("sayHello")
    public String sayHello() {
        return userService.sayHello(new BaseRequest());
    }
}
