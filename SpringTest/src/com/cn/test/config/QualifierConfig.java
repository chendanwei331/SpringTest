package com.cn.test.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cn.test.other.Cake;
import com.cn.test.other.Dessert;

@Configuration
@ComponentScan(basePackageClasses=Dessert.class)
public class QualifierConfig {

	@Bean
	@Qualifier("cak")
	public Dessert getDessert(){
		return new Cake();
	}
}
