<%@ page language="java" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
</head>
<body>
	入门的路径:
	<br>
	<a href="${pageContext.request.contextPath}/test/loginAction.action">测试action</a>
	<br>
	<br>
	<form action="${pageContext.request.contextPath}/test/loginAction" method="post">
		<s:text name="resource.id" />:<input name="id" type="text"><br />
		<s:text name="resource.name" />:<input name="name" type="text"><br />
		<input type="submit" name="提交">
	</form>
	<form action="${pageContext.request.contextPath}/test/uploadAction"
	name="form1"  method="post" enctype="multipart/form-data">
		上传文件是：<input type="file" name="uploadTxt"/>
		<input type="submit" name="提交">
	</form>
</body>
</html>
