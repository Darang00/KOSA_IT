<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	접속한 Client가 가지고 있는 (domain) 별로 기록되어 있는 cookie 값을 read 
	
 -->
<%
	Cookie[] cs = request.getCookies();
	//웹 브라우저가 가지는 모든 쿠키들을 다 가지고 와사ㅓ
	if(cs != null || cs.length>0){
		//개발자 마음
		for(Cookie c : cs){
			out.print("c.getName" + c.getName() + "<br>"); //쿠키 정보 출력
			out.print("c.getValue" + c.getValue()+ "<br>");
			out.print("c.getMaxAge" + c.getMaxAge()+ "<br>"); // -1 (소멸시간이 없다: 메모리)
			out.print("c.getDamain" + c.getDomain()+ "<br>");
			out.print("<hr>");
		}
		
	}
%>

</body>
</html>