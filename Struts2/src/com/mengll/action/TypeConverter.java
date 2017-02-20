package com.mengll.action;

import java.util.Date;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class TypeConverter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Object arg0, Class arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		System.out.println(arg1);
		return "mengll";
	}
}
