package com.cn.test.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cn.test.filter.CustomerFilter;

public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/web/*"};
	}
	
	//重载customizeRegistration方法，实现DispatcherServlet的额外配置
	@Override
	protected void customizeRegistration(javax.servlet.ServletRegistration.Dynamic dynamic){
		//"/tmp/uploads"为临时存储路径
		MultipartConfigElement configElement = new MultipartConfigElement("/tmp/uploads");
		dynamic.setMultipartConfig(configElement);
	}

	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		return new Filter[]{new CustomerFilter()};
	}
}
