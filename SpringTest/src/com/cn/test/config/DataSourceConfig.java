package com.cn.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfig {

	@Bean
	public DruidDataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://10.130.6.85:3306/isgo94?autoReconnect=true&amp;useUnicode=true&amp;characterEncoding=gbk");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dataSource.setInitialSize(20);
		dataSource.setMaxActive(200);
		dataSource.setMaxWait(5000);
		dataSource.setMinIdle(0);
		return dataSource;
	}
	
}
