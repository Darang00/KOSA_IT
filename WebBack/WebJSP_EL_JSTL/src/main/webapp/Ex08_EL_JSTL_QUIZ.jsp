<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

    //String[] hobby = request.getParameterValues("subject")  >>jsp?subject=농구&subject=축구

   //JSTL : paramValues   >> java : request.getParameterValues
   
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var = "key" value = "${paramValues.subject}" />
<c:choose>
	<c:when test="${empty paramValues}">
		<script type="text/javascript">
	      alert("선택을 하세요");
	      location.href="Ex08_Quiz.html";
	    </script>
	</c:when>
	<c:when test="${!empty paramValues}">
		<c:forEach var="specificKey" items="${key}" varStatus="s">
			<ul>
             <li>${specificKey}-${s.index}-${s.count}</li>
            </ul>
			
		</c:forEach>
	</c:when>



</c:choose>

	 
</body>
</html>