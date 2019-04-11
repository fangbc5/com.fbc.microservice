package com.fbc.saas.activiti.base.impl;

import com.fbc.saas.activiti.base.interfaces.IUserService;
import com.fbc.saas.activiti.base.params.BaseRequest;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @ClassName UserServiceImpl
 * @Author fangbc
 * @Date 2019/1/4 18:55
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String sayHello(BaseRequest baseRequest) {
        return "hello";
    }
}
