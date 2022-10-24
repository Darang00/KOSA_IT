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
1. 메모리 쿠키 (브라우저) : client 강제로 지우지 않는 한 ... 브라우저가 닫기 전까지는 유효함
	소멸타임: getMaxAge() 라는 함수 >> 값이 -1이면 메모리 쿠키(소멸되지 않음)

2. 파일 쿠키 (소멸시간을 가지고 있어요): client가 강제로 지우지 않는 한. 정해진 시간까지 유효하다. (2050년 12월 12일)
	setMaxAge(60) >> 60초 뒤에 소멸함 (수명을 강제할 수 있음)
	
	30일
	(30*24*60*60) 일 * 시간 * 분 * 초
	setMaxAge(30*24*60*60) 
	
 -->
 
 <%
 Cookie co = new Cookie("kosa", "dayeong");
 co.setMaxAge(30*24*60*60); //30일
 response.addCookie(co);
 
 
 
 %>

</body>
</html>