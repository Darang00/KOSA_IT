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
           	<form action="${pageContext.request.contextPath}/registerok.do" method="POST">
		ID:<input type="text"      name="id"    placeholder="id 입력"    required="required"><br>
		PWD:<input type="password" name="pwd"   placeholder="pwd 입력"   required="required"><br>
		NAME<input type="text"     name="name"  placeholder="name 입력"  required="required"><br>
		AGE<input type="text"     name="age"  placeholder="age 입력"  required="required"><br>
		GENDER<input type="text"     name="name"  placeholder="gender 입력"  required="required"><br>
		EMAIL<input type="text"     name="email"  placeholder="email 입력"  required="required"><br>
		<input type="submit" value = "회원가입"> 
	</form>
           
         </td>
      </tr>
      <tr>
         <td colspan="2" style="height: 70px;"><jsp:include page="/common/Bottom.jsp"></jsp:include></td>
      </tr>
   </table>
</body>
</html>
