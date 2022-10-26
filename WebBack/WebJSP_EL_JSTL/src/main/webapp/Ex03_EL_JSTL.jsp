<%@page import="kr.or.kosa.Emp"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	Emp e = new Emp(2000, "kosauser");

	HashMap<String, String> hp = new HashMap<>();
	hp.put("data", "1004");
	
	request.setAttribute("emp", e); //EL 사용 가능

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>기존방식</h3>
	<%=e %><br>
	<%=e.getEname() %><br>
	<%=e.getEmpno() %><br>
	
	<h3>EL 출력</h3>
	EL: 자바 객체 출력(자바 객체에 대한 직접 접근 불가): ${e}<br>
	EL: ${e.getEmpno()}<br>
	
	<h3>해결사</h3>
	1. request 객체 또는 session 객체에 담는다 ^^ <br>
	EL: ${requestScope.emp}<br>
	
	2. JSTL 사용해서 처리 <br>
	
	<h3>JSTL(core): 변수생성, 제어문 (자바코드의 도움 없이): 서버에서 해석되고 실행되는 자원</h3>
	<c:set var="m" value="<%= e%>" />
	JSTL 사용해서 변수 m을 생성 (EL 사용해서 접근 가능) : ${m}<br>
	getter 함수(권장 방법은 아님): ${m.getEmpno()}<br>
	
	EL 출력 (m.memberfield 명 : 자동으로 getter 함수 호출) : ${m.empno} <br>
	EL 출력 (m.memberfield 명 : 자동으로 getter 함수 호출) : ${m.ename} <br>
	
	<!-- 
	EL: 출력 목적 >> 변수, 제어구조 없어요
	JSTL: EL을 도와서 변수, 제어구조 출력 도와줘요 ^^ 
	 -->
	 <c:set var = "username" value = "${m.ename}"/>
	 변수값 출력: ${username}<br>
	 
	<hr>
	<h3>JSTL 변수를 만들고 Scope을 정의하기</h3>
	<c:set var = "job" value = "농구선수" scope="request"/> 
	당신의 직업은 : ${job}<br>
	만약에 당신이 include, forward 를 통해서 page를 제어하면 그 페이지에서도 EL을 통해서 job이라는 변수 값을 출력할 수 있다.
	
	<hr>
	<c:set var = "job2" value = "야구선수" />
	값을 출력: ${job2}<br>

	만든 변수 삭제 기능(잘 쓰지 않아요)<br>
	<c:remove var="job2"/>
	값출력(삭제: 결과가 안나올 뿐 예외가 터지진 않아요): ${job2 }<br>
	
	<hr>
	JAVA API 제공 객체(직접): ${hp}<br>
	1. request 또는 session 에 담는다 (권장사항)<br>
	2. JSTL 사용<br>
	
	<c:set var = "vhp" value = "<%=hp %>" />
	hp 객체: ${vhp}<br>
	hp 객체: ${vhp.data}<br>
	
	<hr>
	값을 write 할 있음 (hp.put("color", "red")): 그냥 구경만 해라.. c:set의 목적이 값을 
	<c:set target="${vhp} property="color" value = "red" />
	hp객체: ${vhp}<br>
	
	
</body>
</html>