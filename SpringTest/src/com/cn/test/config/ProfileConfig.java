package com.cn.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cn.test.other.MovieFinder;
import com.cn.test.other.SimpleMovieLister;

@Configuration
public class ProfileConfig {

	@Bean(name="simpleMovieLister")
	@Profile("dev")
	public SimpleMovieLister getSimpleMovieLister(){
		return new SimpleMovieLister();
	}
	
	@Bean(name="movieFinder")
	@Profile("dev")
	public MovieFinder getMovieFinder(){
		return new MovieFinder();
	}
	
}
