package com.hqh.springboot.start.mybatis;

import com.hqh.mybatis.datasource.MutiRouteDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
@ConditionalOnClass(MutiRouteDataSource.class)
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class JeesuiteDataSourceConfiguration {

	@Bean("dataSource")
    public DataSource dataSourceBean(){
    	return new MutiRouteDataSource();
    }
}
