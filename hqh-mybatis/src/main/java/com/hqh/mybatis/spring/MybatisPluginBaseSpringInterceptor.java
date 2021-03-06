package com.hqh.mybatis.spring;

import com.hqh.mybatis.datasource.DataSourceContextHolder;
import com.hqh.mybatis.plugin.cache.CacheHandler;
import com.hqh.mybatis.plugin.rwseparate.UseMaster;
import io.seata.spring.annotation.GlobalTransactional;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;

/**
 * AOP拦截器基类
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2018年5月1日
 */
public abstract class MybatisPluginBaseSpringInterceptor {

	public abstract void pointcut();

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		try {
			MethodSignature methodSignature = (MethodSignature)pjp.getSignature();    
			Method method = methodSignature.getMethod();
			if(method.isAnnotationPresent(UseMaster.class) || method.isAnnotationPresent(Transactional.class) || method.isAnnotationPresent(GlobalTransactional.class)){
				DataSourceContextHolder.get().forceMaster();
			}
			return pjp.proceed();
		} catch (Exception e) {
			CacheHandler.rollbackCache();
			throw e;
		}finally {
			DataSourceContextHolder.get().clear();
		}
		
	}
}
