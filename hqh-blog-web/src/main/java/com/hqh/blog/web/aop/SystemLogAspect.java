package com.hqh.blog.web.aop;


import com.hqh.blog.message.dao.model.BlogUserLog;
import com.hqh.blog.message.rpc.api.BlogUserLogService;
import org.apache.dubbo.config.annotation.Reference;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
@Component
@SuppressWarnings("all")
public class SystemLogAspect {


    @Reference(version = "1.0",
            application = "${dubbo.application.id}", check = false,timeout = 99999999,retries = 0)
    private BlogUserLogService blogUserLogService;

    //controller层切点
    @Pointcut("@annotation(com.hqh.blog.web.aop.SystemControllerLog)")
    public void controllerAspect(){

    }


    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("调用前!!!");
        BlogUserLog blogUserLog = new BlogUserLog();
        blogUserLog.setDescription("调用前");
        blogUserLog.setUsername("");
        blogUserLog.setStartTime(0L);
        blogUserLog.setSpendTime(0);
        blogUserLog.setBasePath("");
        blogUserLog.setUri("");
        blogUserLog.setUrl("");
        blogUserLog.setMethod("");
        blogUserLog.setUserAgent("");
        blogUserLog.setIp("");
        blogUserLog.setPermissions("");
        blogUserLog.setTenantId("");
        blogUserLog.setUserId(0);
        blogUserLog.setOrgId(0);
        blogUserLog.setOrganizationId(0);
        blogUserLog.setParameter("");
        blogUserLog.setResult("joinPoint");
        blogUserLogService.insert(blogUserLog);
    }

    @After("controllerAspect()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("调用后~~~");
    }
}
