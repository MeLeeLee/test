<%@ page language="java" pageEncoding="utf-8"
	contentType="text/html; charset=utf-8"%>
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
	<form action="${pageContext.request.contextPath}/test/login_Action">
		id:<input name="id" type="text"><br /> name:<input name="name"
			type="text"><br /> <input type="submit" name="提交">
	</form>
</body>
</html>
