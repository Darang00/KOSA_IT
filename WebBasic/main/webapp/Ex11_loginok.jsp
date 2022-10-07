<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    // 영역: java 코드를 구현하는 연역 (Back 단)
	// action="Ex11_loginok.jsp"
	
	//클라이언트에서 도착한 데이터 받기
	//<input type="text" name="id"
	//<input type="papssword" name="pwd">
    
    String userid=request.getParameter("id");
    String pwe =  request.getParameter("pwd");
    //클라이언트가 입력한 id, pw 서버엣 받는 것
    
    //필요하다면 
    //insert into member(id, pwd), vallues(userid. pwd);
    
	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


  <h3>당신이 입력한 데이터</h3>
	ID:<% userid %><br>
	PWD: <%pwd%> 

</body>
</html>