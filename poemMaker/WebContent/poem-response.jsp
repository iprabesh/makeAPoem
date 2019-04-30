<%@page import="com.haikuMaker.jsp.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 The first word is ${param.first}
 <br />
 The Second word is ${param.second }
 <br />
 The Third word is ${param.third }
 <br />
 <strong> Your Poem is: </strong>

 <p>
 	<%= haikuMaker.makeHaiku("$(param.first)", "$(param.second)", "$(param.third") %>
 </p>
</body>
</html>