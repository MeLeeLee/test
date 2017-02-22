package com.mengll.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class loginAction extends ActionSupport {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public String execute() throws Exception {
		System.out.println("loginactiong----excute");
		return "success";
	}

	public String login() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		return "success";
	}
}
