<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%
    /*
    JSTL 구문(WAS 해석 (서버쪽 스크립트 자원))
    **<c:set> 변수생성, 값을 저장
    <c:remove> 변수 삭제
    ***<c:if test=""> 조건문 test="조건식 true, flase"
    ***<c:choose> 여러가지 조건 처리 (if 활용도가 높아요)
    ***<c:forEach> 반복문 (자바: 개선된 for문) >> javascript >> foreach...
    <c:forTokens> for 문 split 결합
    <c:out> 출력식 EL ${} 사용
    *<c:catch> 예외처리도 가능
    
    */
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JSTL & EL</h3>
	EL parameter: ${param.id}-${param.pwd}<br>
	<h3>EL로 받은 값을 변수에 저장</h3>
	<c:set var="userid" value="${param.id}"/>
	<c:set var="userpwd" value="${param.pwd}"/>
	<hr>
	<h3>JSTL 변수값 출력</h3>
	id:${userif }<br>
	pwd:${userpwd }<br>
	<hr>
	<c:if test="${!empty userpwd}" /> <!-- pwd가 존재한다면 -->
	<h3> not empty userpwd</h3>
	<c:if test="${userpwd == '1004'}">
	<h3>Welcome to the admin page</h3>
	</c:if>
	
	<!-- 
	http://192.168.0.48:8090/WebJSP_EL_JSTL/Ex05_EL_JSTL.jsp?id=hhh&pwd=1007
	http://192.168.0.48:8090/WebJSP_EL_JSTL/Ex05_EL_JSTL.jsp?id=hhh&pwd=1004
	 -->


</body>
</html>