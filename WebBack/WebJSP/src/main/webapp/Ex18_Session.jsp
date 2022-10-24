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
 Server (웹 서버(WAS) (메모리) + DB서버)
      1. server memory : session 객체   (사이트 접속하는 *사용자*마다 고유하게 부여하는 메모리(객체)) >> 서버가 리부팅, 개발코드변경 > 소멸 > 생성
      2. server memory : application 객체   (사이트 접속하는 사용자마다 고유하게 부여하는 메모리(객체)) >> 서버가 리부팅, 개발코드변경 > 소멸 > 생성
	
	session 객체가지고 할 수 있는게 너무 많다ㅋ
	session 객체: 서버(Web)에 접속한 사용자 마다 고유하게 부여되는 객체
	고유성 보장 (key 값) >> 각각의 session 객체마다 이름표 붙인다 그 이름표가 바로 > key 값 > 이 key 값은 client에게도 전달됨
	활용) client 마다 고유하게 부여 (session 객체)
	>> 로그인ID, 장바구니(사용자마다 다른), 사용자의 정보 (각각 다른 정보) , 사용자마다 접속한 시간, 마지막 접속한 시간
	
	1. http://192.168.0.48:8090/WebJSP/Ex18_Session.jsp 서버에 요청 보내기
	2. session ID (key) 생성 -> session -> sessionID, response 해용(cookie)
	2.1 JSESSIONID : 0990E83CF0039168B16A760327C6A9C3
	3. 동기화 (너랑 나랑 친구다)
	
	ex) 접속자 1000명이 Web Server에는 key 1000개 만들어지고 key 이름표로 달고 있는 session 객체도 1000개 생성
	
	ex) Client 로그아웃 버튼 클릭 >> 어떠한 작업을 수행할까요 >> 로그아웃 판단 >> key 가지고 와서 
		>> key(이름표) >> 객체를 찾아서 >> abandon (소멸) >> invalidate 
		
		
	
	
 -->

</body>
</html>