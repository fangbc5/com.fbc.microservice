package com.fbc0928.dysms.listener;

import com.fbc0928.dysms.service.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;

import java.util.Map;

/**
 * Created by Fang on 2018/8/13.
 */
public class SmsListener {

    @Value("${activemqToSendSms}")
    private Boolean activemqToSendSms;

    @JmsListener(destination = "fbc0928_sms")
    public void sendSms(Map<String, String> map) {
        if (activemqToSendSms) {
            SmsUtil.sendMessage(map);
        }
    }
}
