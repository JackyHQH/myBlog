/**
 * 
 */
package com.hqh.mybatis.plugin.cache.annotation;

import com.hqh.mybatis.core.BaseEntity;

import java.lang.annotation.*;

/**
 * 缓存关联更新
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2016年12月4日
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CacheEvictCascade {
	/**
	 * 级联更新其他的实体组
	 * @return
	 */
	Class<? extends BaseEntity>[] cascadeEntities() default {};
}
