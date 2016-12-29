package com.cn.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.cn.test.other.ConditionMatch;
import com.cn.test.other.Dessert;
import com.cn.test.other.MovieFinder;
import com.cn.test.other.SimpleMovieLister;

@Configuration
@ComponentScan(basePackageClasses=Dessert.class)
public class ConditionalConfig {

	@Bean(name="simpleMovieLister")
	@Conditional(ConditionMatch.class)
	public SimpleMovieLister getSimpleMovieLister(){
		return new SimpleMovieLister();
	}
	
	@Bean(name="movieFinder")
	@Conditional(ConditionMatch.class)
	@Primary
	public MovieFinder getMovieFinder(){
		return new MovieFinder();
	}
	
}
