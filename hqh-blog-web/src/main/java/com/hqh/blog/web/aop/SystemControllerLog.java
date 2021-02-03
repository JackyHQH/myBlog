package com.hqh.blog.web.aop;


import java.lang.annotation.*;

/**
 * 自定义注解，拦截controller
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})//作用在参数和方法上
@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Documented//表明这个注解应该被 javadoc工具记录
public @interface SystemControllerLog {
    String description() default "ControllerLogs";
}
