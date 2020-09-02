package com.hqh.blog.web.service.impl;

import com.hqh.blog.web.service.PayService;
import org.springframework.stereotype.Component;

@Component("ALIPAY")
public class AliPayServiceImpl implements PayService {
    @Override
    public String pay() {
        return "支付宝支付成功";
    }
}
