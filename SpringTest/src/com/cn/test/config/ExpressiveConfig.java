package com.cn.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.cn.test.other.ExampleBean;

@Configuration
@PropertySource("classpath:/resource/test_dev.properties") //声明属性源
public class ExpressiveConfig {

	@Autowired
	Environment env;
	
	@Bean
	public ExampleBean exampleBean(){
		ExampleBean ex = new ExampleBean();
		ex.setUltimateAnswer(env.getProperty("disc.ultimateAnswer1",String.class));
		ex.setYears(env.getProperty("disc.years1",Integer.class,10));
		return ex;
	}
}
