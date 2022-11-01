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
      <tr><!-- top -->
      	
         <td colspan="2"; style="height: 70px;">
            <jsp:include page="/common/Top.jsp"></jsp:include>
         </td>
      </tr> <!-- top end-->
      
      <tr> <!-- contents -->     
         <td style="width: 700px"class="container">
			<form action="${pageContext.request.contextPath}/sign_in_ok.do" method="POST" class="col">
			
				
				<div class="login-wrap p-0">
				<div class="login">

		      	<h3 class="mb-4 text-center" style="text-align:center">Have an account?</h3>
		      	<form action="#" class="signin-form">
		      		<div class="form-group">
		      			<input type="text" class="form-control" placeholder="Username" required>
		      		</div>
	            <div class="form-group">
	              <input id="password-field" type="password" class="form-control" placeholder="Password" required>
	              <span toggle="#password-field"></span>
	            </div>
	            <div class="form-group">
	            	<button type="submit" class="form-control btn btn-primary submit px-3" style="width: 80% ">Sign In</button>
	            <!-- <input type="reset" value="cancel"> -->
	            </div>
	            <div class="form-group d-md-flex">
	            	<div class="w-50">
	            	</div>

	            </div>
		      </div>
		      </div>
				
			</form>
		</td>
      </tr> <!-- contents end -->
      
      <tr>  <!-- bottom -->
         <td colspan="2" style="height: 70px;"><jsp:include page="/common/Bottom.jsp"></jsp:include></td>
      </tr>  <!-- bottom end -->
   </table>
</body>
</html>
