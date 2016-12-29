package com.cn.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages={"com.cn.test"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppConfig {
    
}
