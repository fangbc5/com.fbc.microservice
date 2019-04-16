package com.fbc0928.dysms.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.fbc0928.dysms.service.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Fang on 2018/8/14.
 */
@RestController
@RequestMapping("/sms")
public class SmsController {

    @RequestMapping("/sendSms")
    public void sendSms(Map<String, String> map) {
        SmsUtil.sendMessage(map);
    }
}
