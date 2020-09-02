package com.hqh.blog.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PayFactory {

    @Autowired
    private Map<String, PayService> payServiceMap = new ConcurrentHashMap<>();

    public PayService createPay(String type){
        return payServiceMap.get(type);
    }
}
