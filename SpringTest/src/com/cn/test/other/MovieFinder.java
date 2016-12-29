package com.cn.test.other;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class MovieFinder {

	public String testAutowird(){
		return "autowird";
	}
	
	@PostConstruct
	public void init(){
		System.out.println("MovieFinder  init....");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("MovieFinder  destroy....");
	}
}
