package com.mengll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.mail.iap.Response;

public class TestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getScheme());
		System.out.println(req.getServerName());
		System.out.println(req.getServerPort());
		System.out.println(req.getContextPath());
		PrintWriter printWriter=resp.getWriter();
		ServletContext context=this.getServletContext();
		System.out.println(context.getInitParameter("name"));
		context.setAttribute("password", "qwe");
		System.out.println(context.getAttribute("password"));
		Enumeration<String> a=context.getInitParameterNames();
		printWriter.write("qwe");
	}
}
