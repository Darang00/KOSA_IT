<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
/*
응답할 수 있는 방법
1. <%=

2. <% 안에서 out 객체

장단점을 이해하기




*/



%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>혼합된 코드(정작 자원 + 동적 자원)</title>
</head>
<body>
	<h3>스파게티 코드 (UI 작업)</h3>
	<%
	boolean b = true;
	if(10 > 5){
		%>
		IF(true)<font color = "red"><%=b %></font>
		<%
	}else{
		b=false;
		
		%>
		
		IF(false)<font color="blue"><%=b %></font>
		<% 
	}
	
	%>
	
	
	
	<h3>out 객체 (서버에서 코드작업)</h3>
	<%
	boolean b2 = true;
	if(10>5){
		out.print("IF(true)<font color = 'green'>"+b2+"</font>");
	}else{
		b = false;
		out.print("IF(true)<font color = 'blue'>"+b2+"</font>");
	}
	
	%>
</body>
</html>