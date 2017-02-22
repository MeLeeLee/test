package com.mengll.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File uploadTxt;
	public File getUploadTxt() {
		return uploadTxt;
	}
	public void setUploadTxt(File uploadTxt) {
		this.uploadTxt = uploadTxt;
	}
	public String getUploadTxtFileName() {
		return uploadTxtFileName;
	}
	public void setUploadTxtFileName(String uploadTxtFileName) {
		this.uploadTxtFileName = uploadTxtFileName;
	}
	public String getUploadTxtContentType() {
		return uploadTxtContentType;
	}
	public void setUploadTxtContentType(String uploadTxtContentType) {
		this.uploadTxtContentType = uploadTxtContentType;
	}
	private String uploadTxtFileName;
	private String uploadTxtContentType;
	public String upload() {
		System.out.println("UploadAction****************upload");
		ServletContext context=ServletActionContext.getServletContext();
		String path=context.getRealPath("/file");
		System.out.println(path);
		File file=new File(path,uploadTxtFileName);
		try {
			FileUtils.copyFile(uploadTxt, file);
			uploadTxt.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
