package com.hqh.blog.message;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import com.hqh.blog.message.dao.model.BlogMessage;
import com.wondersgroup.oms.springboot.starter.mybatis.EnableJeesuiteMybatis;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * @Author: HQH
 * @Version V1.0
 * @Description ${Description}
 * @Date: 2020/04/30 16:535
 */
@MapperScan("com.hqh.blog.message.dao.mapper")
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class, DataSourceAutoConfiguration.class})
@EnableJeesuiteMybatis
@DubboComponentScan("com.hqh.blog.message.rpc.service.impl")
@EnableMethodCache(basePackages = "com.hqh.blog.message")
@EnableCreateCacheAnnotation
public class BlogMessageApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogMessageApplication.class);

    @PostConstruct
    void started() {
        //时区设置：中国上海
        //time.zone: "Asia/Shanghai"
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(BlogMessageApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
