package com.cn.test.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	
    @Bean
    public MovieFinder movieFinder() {
        return new MovieFinder();
    }
}
