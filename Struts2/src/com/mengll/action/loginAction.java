package com.mengll.action;

import java.io.File;

import com.mengll.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class loginAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public String execute() throws Exception {
		System.out.println("loginactiong----excute");
		return "success";
	}

	public String login() {
		System.out.println("id = " + user.getId());
		System.out.println("name = " + user.getName());
		return "success";
	}
}
