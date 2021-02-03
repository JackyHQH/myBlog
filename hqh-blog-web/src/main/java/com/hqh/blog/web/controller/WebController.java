package com.hqh.blog.web.controller;

import com.hqh.blog.message.dao.aop.SystemServiceLog;
import com.hqh.blog.message.dao.model.BlogMessage;
import com.hqh.blog.message.dao.model.BlogTime;
import com.hqh.blog.message.rpc.api.BlogTimeService;
import com.hqh.blog.web.aop.SystemControllerLog;
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
import java.util.regex.Pattern;

@Controller
@RequestMapping(value = "/blog")
@Slf4j
public class WebController {

    @Reference(version = "1.0",
            application = "${dubbo.application.id}", check = false,timeout = 99999999,retries = 0)
    private BlogMessageService blogMessageService;

    @Reference(version = "1.0",
            application = "${dubbo.application.id}", check = false,timeout = 99999999,retries = 0)
    private BlogTimeService blogTimeService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
        List<BlogTime> list = blogTimeService.selectAllMsg();
        return new WebResult(WebResultConstant.SUCCESS,list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    @SystemControllerLog(description = "添加名称")
    public Object add(String name) {
        if(null == name||"".equals(name)){
            return new WebResult(WebResultConstant.FAILED,"输入名字啊傻逼");
        }
        BlogTime time = blogTimeService.addMsg(name);
        return new WebResult(WebResultConstant.FAILED,"您好["+time.getName()+"],您已经被小仙女调用了"+time.getTimes()+"次");
    }


    public static void main(String[] args) {
        String str = "213123123213123L";
        System.out.println(isNumeric(str));
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

}
