<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<a href="Ex02_JDBC_Main.jsp">Main</a>&nbsp;&nbsp;&nbsp;
<!--<a href="Ex02_JDBC_Login.jsp">Login</a>&nbsp;&nbsp;&nbsp;||-->
<a href="sign_in.do">Login</a>&nbsp;&nbsp;&nbsp;
<!--<a href="Ex02_JDBC_JoinForm.jsp">Register</a>&nbsp;&nbsp;&nbsp;||  -->
<a href="register.do">Register&nbsp;&nbsp;&nbsp;




<%
	if(session.getAttribute("userid") != null){
		out.print("<b>[ " + session.getAttribute("userid") +" ]</b> 로그인 상태");
		out.print("<a href='Main.jsp'>[ 로그아웃 ]</a>");
	}else{
		out.print("<b>로그아웃 상태입니다</b>");

	}
%>

