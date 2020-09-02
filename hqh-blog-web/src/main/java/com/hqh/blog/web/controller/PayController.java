package com.hqh.blog.web.controller;

import com.hqh.blog.web.service.PayFactory;
import com.hqh.blog.web.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pay")
public class PayController {


    @Autowired
    private PayFactory payFactory;

    @ResponseBody
    @RequestMapping(value = "/way",method = RequestMethod.GET)
    public String pay(String type){
        PayService payService= payFactory.createPay(type);
        return payService.pay();
    }
}
