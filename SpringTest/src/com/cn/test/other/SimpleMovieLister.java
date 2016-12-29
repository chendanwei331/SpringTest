package com.cn.test.other;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on a MovieFinder
	@Autowired
    private MovieFinder movieFinder;

    // a constructor so that the Spring container can inject a MovieFinder
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    // business logic that actually uses the injected MovieFinder is omitted...
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    
    public void testAutowired(){
    	System.out.println(movieFinder.testAutowird());
    }

	public SimpleMovieLister() {
		super();
	}
    
	@PostConstruct
	public void init(){
		System.out.println("SimpleMovieLister  init....");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("SimpleMovieLister  destroy....");
	}
}
