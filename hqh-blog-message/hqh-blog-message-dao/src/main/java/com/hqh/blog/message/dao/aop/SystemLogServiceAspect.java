package com.hqh.blog.message.dao.aop;


import com.hqh.blog.message.dao.model.BlogUserLog;
import com.hqh.blog.message.dao.utils.IpUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@SuppressWarnings("all")
public class SystemLogServiceAspect {


    //service层切点
    @Pointcut("@annotation(com.hqh.blog.message.dao.aop.SystemServiceLog)")
    public void serviceAspect(){

    }

    @Before("serviceAspect()")
    public void doBeforeService(JoinPoint point){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String ip = IpUtil.getIpAddr(request);
        System.out.println(ip);
        System.out.println("service调用前~~~");
    }


    @Before("serviceAspect()")
    public void doAfterService(JoinPoint joinPoint){
        System.out.println(joinPoint);
        System.out.println("service调用后~~~");
    }
}
