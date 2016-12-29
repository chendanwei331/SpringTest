package com.cn.test.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class SessionFactoryConfig {

	/**
	    * @Title: sessionFactory
	    * @Description: 配置sessionFactory
	    * @param dataSource
	    * @return    参数
	    * @return AnnotationSessionFactoryBean    返回类型
	    * @throws
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory(DruidDataSource dataSource){
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		sfb.setDataSource(dataSource);
		sfb.setPackagesToScan(new String[]{"com.cn.test.bo"});
		Properties props = new Properties();
		props.setProperty("dialect","org.hibernate.dialect.H2Dialect");
		sfb.setHibernateProperties(props);
		return sfb;
	}
	
}
