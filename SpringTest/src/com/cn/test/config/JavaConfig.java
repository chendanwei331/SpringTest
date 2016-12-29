package com.cn.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cn.test.other.MovieFinder;
import com.cn.test.other.SimpleMovieLister;

@Configuration
public class JavaConfig {

	@Bean(name="simpleMovieLister")
	public SimpleMovieLister getSimpleMovieLister(){
		return new SimpleMovieLister();
	}
	
	@Bean(name="movieFinder")
	public MovieFinder getMovieFinder(){
		return new MovieFinder();
	}
}
