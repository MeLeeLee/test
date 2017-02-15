package com.mengll.action;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception {
		if (this.name.equals("qwe"))
			return "success";
		else
			return "false";
	}
}
