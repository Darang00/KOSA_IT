<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">	
	
	<link rel="stylesheet" href="css/style.css">
<style type="text/css">
table {
   border: solid 2px black;
   border-collapse: collapse;
   background-color: rgba(255, 255, 255, 0);
   position: relative;
   bottom: -20px;
}

tr {
   border: solid 1px blue;
   /* background-color: white; */
   color: black;
}

td {
   border: solid 1px red;
}
</style>

</head>
<body> 

<section class="main-section">
 <table
      style="width: 900px; height: 500px; margin-left: auto; margin-right: auto;">
      <tr>
         <td colspan="2"; style="height: 70px;">
            <jsp:include page="/common/Top.jsp"></jsp:include>
         </td>
      </tr>
      <tr>
        
         <td style="width: 700px" style="height: 700px;">
            <!-- MAIN PAGE CONTENT  -->
            <%
               String id = null;
               id = (String)session.getAttribute("id");
               out.print(id);
               if(id == null){
                  out.print("<script>");
                  out.print("alert('세션없음');");
                  out.print("</script>");
               }
               else{
                  out.print("<script>");
                  out.print("alert('세션있음');");
                  out.print("</script>");
               }
               /* if(id != null){
                  //회원
                  out.print(id + " 회원님 방가방가^^<br>");
                  if(id.equals("admin")){
                     out.print("<a href='Ex03_Memberlist.jsp'>회원관리</a>");
                  }
               }else{
                  //로그인 하지 않은 사용자
                  //메인 페이지는 회원만 볼수 있어요 (강제 링크 추가)
                  out.print("사이트 방문을 환영합니다 ^^ <br>회원가입 좀 하지 ...");

               } */

               
               
               
               
            %>
         </td>
      </tr>
      <tr>
         <td colspan="2" style="height: 70px;"><jsp:include page="/common/Bottom.jsp"></jsp:include></td>
      </tr>
   </table>
</body>
</html>
