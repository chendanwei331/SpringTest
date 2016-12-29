package com.cn.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CustomerFilter implements Filter{
	

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("CustomerFilter init...");
	}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("测试过滤器.....");
		filterchain.doFilter(servletrequest, servletresponse);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("CustomerFilter destroy...");
	}

}
