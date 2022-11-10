<%@page import="kr.or.bit.service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<script type="text/javascript">
	let httpReq=null; //XMLHttpRequest 객체 생성

		window.onload = function(){
			 document.getElementById("list").addEventListener("click",function(){ 

				 let data =document.getElementById("empno").value;

			     if(data ==""){
			    	 sendDataTotal();
			     } else{
			    	 sendDataCon(data);
			     }
			
			 })
		}
		
		function getInstance(){
			  if(window.XMLHttpRequest){
				  httpReq = new XMLHttpRequest(); //현재 브라우져 XMLHttpRequest 내장
			  }else if(window.ActiveXObject){ //IE6 이하   //지금 필요없어요
				  httpReq = new ActiveXObject("Msxml2.XMLHTTP");
			  }else{
				 throw new Error("AJAX 지원하지 않습니다"); 
			  }
			return httpReq;  
		}
		function handlerStateChange(){
			 if(httpReq.readyState == 4){ //서버에서 응답이 왔다면
				 //httpReq.readyState == 4 : 서버에서 응답이 완료된 상태
				 if(httpReq.status >= 200 && httpReq.status < 300){
					 //httpReq.status >= 200 : 
					 //서버가 클라이언트가 요청한 동작을 수신하여 이해했고 승낙했으며 성공적으로 처리했음
					
		  			document.getElementById("d").innerHTML = httpReq.responseText;
					/* let d = document.getElementById('d');
					d.innerHTML = httpRequest.responseText*/
		  				}
				 }else{
				 }
			 }
		
		function sendDataCon(data){
			httpReq = getInstance();
			httpReq.onreadystatechange = handlerStateChange;  // x >> () //handlerStateChange함수 바로 실행시키면 안돼서 () 없고, 대기만 하고 있다.
			console.log(data);
			httpReq.open("POST","EmpList?empno="+data); //<form 태그 구성 method=  action= //초기화: open(HTTP method, URL, syn/asy) 메소드
				//사용자가 입력한 data값을 EmpList.java (servlet 파일)의 empno와 비교하겠다는 통신 요청
			httpReq.send(); // form submit 버튼 클릭 // EmpList.java (servlet 파일)로 data 전송 //전송: send 메소드
		}
		
		function sendDataTotal(){
			httpReq = getInstance();
			httpReq.onreadystatechange = handlerStateChange;  // x >> () //handlerStateChange함수 바로 실행시키면 안돼서 () 없고, 대기만 하고 있다.
			httpReq.open("POST","EmpList"); //<form 태그 구성 method=  action=
				//입력한 값이 없을 때 실행하므로 parameter 설정하지 않았음. 이 함수가 호출되면 EmpList.java라는 servlet 파일을 준비한다는 선언
			httpReq.send(); // form submit 버튼 클릭
		}
	</script>
<%
	//한글처리
	request.setCharacterEncoding("UTF-8");
	//데이터 받기
	String writer = request.getParameter("reply_writer");
	String content = request.getParameter("reply_content");
	String pwd = request.getParameter("reply_pwd");
	String idx_fk = request.getParameter("idx");
	String userid = "empty";
	//service 객체 생성
	BoardService service = BoardService.getInBoardService();
	int result = service.replyWrite(Integer.parseInt(idx_fk), writer, userid, content, pwd);
	
	//처리하는 코드
 	String msg="";
    String url="";
    
    if(result > 0){
    	msg ="댓글 입력 성공";
    	url ="board_content.jsp?idx="+idx_fk;
    }else{
    	msg="댓글 입력 실패";
    	url="board_content.jsp?idx="+idx_fk;
    }
    
    request.setAttribute("board_msg",msg);
    request.setAttribute("board_url", url);
%>
<jsp:forward page="redirect.jsp"></jsp:forward>






