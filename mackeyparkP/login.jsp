<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
ログイン画面
<s:form action="LoginAction">
<s:textfield name="id" placeholder="ログインid"/>
<s:textfield name="password" placeholder="pass"/>
<s:submit label="送信" type="button"/>
</s:form>
</body>
</html>