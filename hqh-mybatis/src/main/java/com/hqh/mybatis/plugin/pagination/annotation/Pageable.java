/**
 * 
 */
package com.hqh.mybatis.plugin.pagination.annotation;

import java.lang.annotation.*;

/**
 * 分页标注
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2017年6月22日
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Pageable {
	
}
