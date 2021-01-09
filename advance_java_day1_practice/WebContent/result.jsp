<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Roll Number is
<%=request.getAttribute("roll_no") %>
and name<%=request.getAttribute("name") %>
allocated course<%=request.getAttribute("course") %>
course duration<%=request.getAttribute("duration") %>
and age is<%=request.getAttribute("age") %></h2>
</body>
</html>