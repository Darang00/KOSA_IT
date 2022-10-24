<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 
    Today Point
    개념 이해 (서버 자원 활용하기)
    session 객체 가지고 놀기
     1. session 객체(사용자마다 부여되는 고유한 객체)
     >> 접속하는 브라우저마다 (sessionID)값을가지고 객체 관리
     >> session.setAttribute() 라는 함수: 접속한 사용자마다 고유한 변수 만들기..
     >> session.setAttribute("id", request.getParameter("userid"));
     
     접속자 3명
     1. dayeong 접속: 서버는 객체 생성(session): 식별값: A1: 생성된 session 객체 안에다가 변수 만들고 값 만들어서 놀 수 있음.
     - session 객체(id, lho)
     
     2. Jalil 접속: A2
     - session 객체 (id, Elamrou)
     
     ..등등 ....
     
     
     -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 정보</h3>
   sessionID : <%=session.getId() %>
   <br>
   
   <h3>세션 변수(set)</h3>
   <%
      String userid = request.getParameter("userid");
      //POINT
      session.setAttribute("id", userid);  //***** (클라이언트에 저장)
   %>
   
   <h3>내가 필요시 (세션 변수 ... get)</h3>
   <%
      String id =(String)session.getAttribute("id");  //리턴타입이 오브젝트라 스트링으로 다운캐스팅
      out.print("당신의 id는 <b>"+ id +"</b>");
   %>
</body>
</html>