package com.hqh.blog.web.service.impl;

import com.hqh.blog.web.service.PayService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component("WECHATPAY")
public class WeChatServiceImpl implements PayService {
    @Override
    public String pay() {
        return "微信支付成功";
    }
}
