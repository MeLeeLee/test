package com.mengll.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{
	@Override
	public void init() {
		System.out.println("init.................");
	}
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("intercept...............");
		return "success";
	}
	@Override
	public void destroy() {
		System.out.println("destory................");
	}

}
