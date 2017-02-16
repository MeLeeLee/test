package com.mengll.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter{
	FilterConfig config;
	public void destroy() {
		this.config=null;
	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		ServletContext servletContext=this.config.getServletContext();
		String id=this.config.getInitParameter("id");
		Enumeration<String> enumeration=this.config.getInitParameterNames();
		System.out.println("filter...id="+id+"  name="+servletContext.getInitParameter("name"));
		chain.doFilter(request, response);
	}
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config=filterConfig;
	}

}
