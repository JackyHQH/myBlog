package com.hqh.blog.web.controller;

import com.hqh.blog.message.dao.model.BlogMessage;
import com.hqh.blog.web.constant.WebResult;
import com.hqh.blog.web.constant.WebResultConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hqh.blog.message.rpc.api.BlogMessageService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/blog")
@Slf4j
public class WebController {

    @Reference(version = "1.0",
            application = "${dubbo.application.id}", check = false,timeout = 99999999,retries = 0)
    private BlogMessageService blogMessageService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
//        List<BlogMessage> list = blogMessageService.selectAllMessage();
        blogMessageService.selectAllMessage();
        return new WebResult(WebResultConstant.SUCCESS,"测试长沙从");
    }

}
