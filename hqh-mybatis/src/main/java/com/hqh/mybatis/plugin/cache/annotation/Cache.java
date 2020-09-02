/**
 * 
 */
package com.hqh.mybatis.plugin.cache.annotation;

import java.lang.annotation.*;

/**
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2015年12月10日
 * @Copyright (c) 2015, jwww
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Cache {
	/**
	 * 过期时间(单位：秒)
	 * @return
	 */
	long expire() default 0;
}
