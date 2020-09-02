/**
 * 
 */
package com.hqh.springboot.start.mybatis;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2017年3月28日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({JeesuiteMybatisConfiguration.class,JeesuiteDataSourceConfiguration.class})
public @interface EnableJeesuiteMybatis {

}
